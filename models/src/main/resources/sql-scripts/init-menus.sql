-- noinspection SqlNoDataSourceInspectionForFile
-- insert menus
INSERT INTO menus (id, place_id) VALUES (1, 1);
INSERT INTO menus (id, place_id) VALUES (2, 2);
INSERT INTO menus (id, place_id) VALUES (3, 3);

-- insert ingredients
INSERT INTO ingredients (id, title) VALUES (1, 'red pepper');
INSERT INTO ingredients (id, title) VALUES (2, 'chicken');
INSERT INTO ingredients (id, title) VALUES (3, 'potato');
INSERT INTO ingredients (id, title) VALUES (4, 'lettuce');
INSERT INTO ingredients (id, title) VALUES (5, 'tomato');
INSERT INTO ingredients (id, title) VALUES (6, 'beef');
INSERT INTO ingredients (id, title) VALUES (7, 'pork');
INSERT INTO ingredients (id, title) VALUES (8, 'rice');
INSERT INTO ingredients (id, title) VALUES (9, 'green beans');
INSERT INTO ingredients (id, title) VALUES (10, 'green pepper');
INSERT INTO ingredients (id, title) VALUES (11, 'black pepper');
INSERT INTO ingredients (id, title) VALUES (12, 'white pepper');
INSERT INTO ingredients (id, title) VALUES (13, 'egg');
INSERT INTO ingredients (id, title) VALUES (14, 'butter');
INSERT INTO ingredients (id, title) VALUES (15, 'pigeon');

-- insert food
INSERT INTO food (id, title, description, price, menu_id) VALUES (1, 'Piščanec z rižem', 'Piščanec narejen po slovensko', 6.99, 1);
INSERT INTO food (id, title, description, price, menu_id) VALUES (2, 'Piščanec z rižem', 'Piščanec narejen po slovensko', 6.99, 2);
INSERT INTO food (id, title, description, price, menu_id) VALUES (3, 'Piščanec z dušenim rižem', 'Piščanec z dušenim rižem z grahom', 7.49, 1);
INSERT INTO food (id, title, description, price, menu_id) VALUES (4, 'Solata', 'Zelena solata z rdečo papriko in paradižnikom ter prelivi', 4.99, 1);
INSERT INTO food (id, title, description, price, menu_id) VALUES (5, 'Solata', 'Zelena solata z rdečo papriko in paradižnikom ter prelivi', 4.99, 1);
INSERT INTO food (id, title, description, price, menu_id) VALUES (6, 'Piščančja cesarjeva solata', 'Solata narejena za cesarje', 6.99, 1);
INSERT INTO food (id, title, description, price, menu_id) VALUES (7, 'Piščančja cesarjeva solata', 'Solata narejena za cesarje', 5.99, 2);
INSERT INTO food (id, title, description, price, menu_id) VALUES (8, 'Piščančja cesarjeva solata', 'Solata narejena za cesarje', 8.99, 3);
INSERT INTO food (id, title, description, price, menu_id) VALUES (9, 'Mongolska govedina', 'Govedine za vse poševnooke', 5.99, 2);

-- insert food_ingredient
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (1, 2);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (1, 8);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (2, 2);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (2, 8);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (3, 2);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (3, 8);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (3, 9);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (3, 14);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (4, 4);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (4, 1);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (4, 5);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (5, 4);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (5, 1);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (5, 5);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (6, 2);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (6, 4);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (6, 5);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (6, 13);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (7, 2);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (7, 4);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (7, 13);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (8, 2);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (8, 4);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (8, 5);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (8, 13);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (9, 6);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (9, 8);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (9, 14);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (9, 11);
INSERT INTO food_ingredient (food_id, ingredient_id) VALUES (9, 15);

-- insert drinks
INSERT INTO drinks (id, title, description, price, menu_id) VALUES (1, 'Water', 'Do I need to say more? 0.5L of size', 0.99, 1);
INSERT INTO drinks (id, title, description, price, menu_id) VALUES (2, 'Water', 'Do I need to say more? 1L of size', 1.25, 1);
INSERT INTO drinks (id, title, description, price, menu_id) VALUES (3, 'Coca Cola', '0.25L', 1.50, 1);
INSERT INTO drinks (id, title, description, price, menu_id) VALUES (4, 'Orange Juice', '0.2L', 0.99, 1);
INSERT INTO drinks (id, title, description, price, menu_id) VALUES (5, 'Fresh Orange Juice', '0.2L', 1.99, 1);
INSERT INTO drinks (id, title, description, price, menu_id) VALUES (6, 'Water', 'Do I need to say more? 0.5L of size', 0.99, 2);
INSERT INTO drinks (id, title, description, price, menu_id) VALUES (7, 'Water', 'Do I need to say more? 1L of size', 1.25, 2);
INSERT INTO drinks (id, title, description, price, menu_id) VALUES (8, 'Coca Cola', '0.25L', 1.50, 2);
INSERT INTO drinks (id, title, description, price, menu_id) VALUES (9, 'Orange Juice', '0.2L', 0.99, 2);
INSERT INTO drinks (id, title, description, price, menu_id) VALUES (10, 'Fresh Orange Juice', '0.2L', 1.99, 2);
INSERT INTO drinks (id, title, description, price, menu_id) VALUES (11, 'Water', 'Do I need to say more? 0.5L of size', 0.99, 3);
INSERT INTO drinks (id, title, description, price, menu_id) VALUES (12, 'Water', 'Do I need to say more? 1L of size', 1.25, 3);
INSERT INTO drinks (id, title, description, price, menu_id) VALUES (13, 'Pepsi', '0.25L', 1.49, 3);
INSERT INTO drinks (id, title, description, price, menu_id) VALUES (14, 'Orange Juice', '0.2L', 0.99, 3);
INSERT INTO drinks (id, title, description, price, menu_id) VALUES (15, 'Fresh Orange Juice', '0.2L', 1.99, 3);

