package si.fri.tabletop.menus.services;

import com.kumuluz.ee.rest.beans.QueryParameters;
import com.kumuluz.ee.rest.utils.JPAUtils;
import si.fri.tabletop.menus.models.Menu;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.UriInfo;
import java.util.List;

@ApplicationScoped
public class MenusBean {

    @Inject
    private EntityManager em;

    public List<Menu> getMenus(UriInfo uriInfo) {

        QueryParameters queryParameters = QueryParameters.query(uriInfo.getRequestUri().getQuery())
                .defaultOffset(0)
                .build();

        return JPAUtils.queryEntities(em, Menu.class, queryParameters);

    }

    public Menu getMenu(String menuId) {

        Menu menu = em.find(Menu.class, menuId);

        if (menu == null) {
            throw new NotFoundException();
        }

        return menu;
    }

    public Menu createMenu(Menu menu) {

        try {
            beginTx();
            em.persist(menu);
            commitTx();
        } catch (Exception e) {
            rollbackTx();
        }

        return menu;
    }

    public Menu putMenu(String menuId, Menu menu) {

        Menu c = em.find(Menu.class, menuId);

        if (c == null) {
            return null;
        }

        try {
            beginTx();
            menu.setId(c.getId());
            menu = em.merge(menu);
            commitTx();
        } catch (Exception e) {
            rollbackTx();
        }

        return menu;
    }

    public boolean deleteMenu(String menuId) {

        Menu menu = em.find(Menu.class, menuId);

        if (menu != null) {
            try {
                beginTx();
                em.remove(menu);
                commitTx();
            } catch (Exception e) {
                rollbackTx();
            }
        } else
            return false;

        return true;
    }

    private void beginTx() {
        if (!em.getTransaction().isActive())
            em.getTransaction().begin();
    }

    private void commitTx() {
        if (em.getTransaction().isActive())
            em.getTransaction().commit();
    }

    private void rollbackTx() {
        if (em.getTransaction().isActive())
            em.getTransaction().rollback();
    }
}
