package si.fri.tabletop.menus.api.v1.resources;

import com.kumuluz.ee.logs.LogManager;
import com.kumuluz.ee.logs.Logger;
import com.kumuluz.ee.logs.cdi.Log;
import si.fri.tabletop.menus.models.Menu;
import si.fri.tabletop.menus.services.MenusBean;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.List;

@ApplicationScoped
@Path("/menus")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Log
public class MenusResource {

    private Logger log = LogManager.getLogger(MenusResource.class.getName());

    @Context
    private UriInfo uriInfo;

    @Inject
    private MenusBean menusBean;

    @GET
    public Response getMenus() {
        log.info("MENUS metoda");
        List<Menu> menus = menusBean.getMenus(uriInfo);
        log.info("Koliko menijev: " + menus.size());
        return Response.ok(menus).build();
    }

    @GET
    @Path("/{menuId}")
    public Response getMenu(@PathParam("menuId") String menuId) {
        log.info("MENU metoda");
        Menu menu = menusBean.getMenu(menuId);
        log.info("MENU: "+ menu.getPlaceId());
        if (menu == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        return Response.status(Response.Status.OK).entity(menu).build();
    }

    @POST
    public Response createMenu(Menu menu) {

        if (menu.getPlaceId() == null || menu.getPlaceId().isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        } else {
            menu = menusBean.createMenu(menu);
        }

        if (menu.getId() != null) {
            return Response.status(Response.Status.CREATED).entity(menu).build();
        } else {
            return Response.status(Response.Status.CONFLICT).entity(menu).build();
        }
    }

    @PUT
    @Path("{menuId}")
    public Response putMenu(@PathParam("menuId") String menuId, Menu menu) {

        menu = menusBean.putMenu(menuId, menu);

        if (menu == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        } else {
            if (menu.getId() != null)
                return Response.status(Response.Status.OK).entity(menu).build();
            else
                return Response.status(Response.Status.NOT_MODIFIED).build();
        }
    }

    @DELETE
    @Path("{menuId}")
    public Response deleteMenu(@PathParam("menuId") String menuId) {

        boolean deleted = menusBean.deleteMenu(menuId);

        if (deleted) {
            return Response.status(Response.Status.GONE).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
