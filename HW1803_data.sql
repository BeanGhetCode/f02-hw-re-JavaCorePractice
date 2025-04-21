ALTER TABLE users
ADD UNIQUE (id, email);

ALTER TABLE carts
    ADD UNIQUE (id);

ALTER TABLE cart_items
    ADD UNIQUE (id);

ALTER TABLE products
    ADD UNIQUE (id);


CREATE  table carts
(
    id integer NOT NULL primary key ,
    user_id integer,
    unique (id)
);

CREATE TABLE cart_items
(
    id integer NOT NULL primary key,
    cart_id integer,
    product_id integer,
    quantity integer,
    unique (id)
);

CREATE TABLE orders
(
    id           integer      NOT NULL primary key,
    description  varchar(500) NOT NULL,
    status       varchar(500) CHECK ( status in ('ORDER_INIT', 'ORDER_PROCESSING', 'ORDER_FAIL', 'ORDER_SUCCESS', 'ORDER_CANCLE', 'PREPARE_PRODUCT', 'DELIVERY_FAIL', 'DELIVERY_SUCCESS')),
    total_amount decimal(19, 3),
    user_id      integer
);

CREATE TABLE order_items
(
    id integer NOT NULL primary key,
    order_id integer,
    product_id integer,
    original_price numeric(19, 3),
    price numeric(19, 3)
);

ALTER TABLE carts
    ADD CONSTRAINT fk_carts_users
        FOREIGN KEY (cart_id)
            REFERENCES users (id);

ALTER TABLE cart_items
    ADD CONSTRAINT fk_cart_items_carts
        FOREIGN KEY (cart_id)
            REFERENCES carts (id),
    ADD CONSTRAINT fk_cart_items_products
        FOREIGN KEY (product_id)
            REFERENCES products (id);

ALTER TABLE order_items
    ADD CONSTRAINT fk_order_items_orders
        FOREIGN KEY (order_id)
            REFERENCES orders (id),
    ADD CONSTRAINT fk_order_items_products
        FOREIGN KEY (product_id)
            REFERENCES products (id);

ALTER TABLE orders
    ADD CONSTRAINT fk_orders_users
        FOREIGN KEY (user_id)
            REFERENCES users (id);

-- Tạo bảng carts
CREATE TABLE carts (
                       id INTEGER NOT NULL PRIMARY KEY,
                       product_id INTEGER NOT NULL,
                       quantity INTEGER,
                       cart_id INTEGER,
                       UNIQUE (id)
);

-- Chèn 50 dữ liệu vào bảng carts
INSERT INTO carts (id, user_id) VALUES
                                    (1, 1),
                                    (2, 2),
                                    (3, 3),
                                    (4, 4),
                                    (5, 5),
                                    (6, 6),
                                    (7, 7),
                                    (8, 8),
                                    (9, 9),
                                    (10, 10),
                                    (11, 11),
                                    (12, 12),
                                    (13, 13),
                                    (14, 14),
                                    (15, 15),
                                    (16, 16),
                                    (17, 17),
                                    (18, 18),
                                    (19, 19),
                                    (20, 20),
                                    (21, 21),
                                    (22, 22),
                                    (23, 23),
                                    (24, 24),
                                    (25, 25),
                                    (26, 26),
                                    (27, 27),
                                    (28, 28),
                                    (29, 29),
                                    (30, 30),
                                    (31, 31),
                                    (32, 32),
                                    (33, 33),
                                    (34, 34),
                                    (35, 35),
                                    (36, 36),
                                    (37, 37),
                                    (38, 38),
                                    (39, 39),
                                    (40, 40),
                                    (41, 41),
                                    (42, 42),
                                    (43, 43),
                                    (44, 44),
                                    (45, 45),
                                    (46, 46),
                                    (47, 47),
                                    (48, 48),
                                    (49, 49),
                                    (50, 50);
-- Chèn 50 dữ liệu vào bảng cart_items
INSERT INTO cart_items (id, cart_id, product_id, quantity) VALUES
                                                               (1, 1, 1, 2),
                                                               (2, 1, 2, 1),
                                                               (3, 2, 3, 5),
                                                               (4, 2, 4, 3),
                                                               (5, 3, 5, 4),
                                                               (6, 3, 6, 2),
                                                               (7, 4, 7, 1),
                                                               (8, 4, 8, 3),
                                                               (9, 5, 9, 2),
                                                               (10, 5, 10, 5),
                                                               (11, 6, 11, 2),
                                                               (12, 6, 12, 1),
                                                               (13, 7, 13, 4),
                                                               (14, 7, 14, 3),
                                                               (15, 8, 15, 1),
                                                               (16, 8, 16, 5),
                                                               (17, 9, 17, 2),
                                                               (18, 9, 18, 3),
                                                               (19, 10, 19, 1),
                                                               (20, 10, 20, 4),
                                                               (21, 11, 21, 3),
                                                               (22, 11, 22, 2),
                                                               (23, 12, 23, 5),
                                                               (24, 12, 24, 3),
                                                               (25, 13, 25, 4),
                                                               (26, 13, 26, 1),
                                                               (27, 14, 27, 2),
                                                               (28, 14, 28, 5),
                                                               (29, 15, 29, 4),
                                                               (30, 15, 30, 3),
                                                               (31, 16, 31, 1),
                                                               (32, 16, 32, 4),
                                                               (33, 17, 33, 5),
                                                               (34, 17, 34, 2),
                                                               (35, 18, 35, 3),
                                                               (36, 18, 36, 1),
                                                               (37, 19, 37, 2),
                                                               (38, 19, 38, 4),
                                                               (39, 20, 39, 3),
                                                               (40, 20, 40, 5),
                                                               (41, 21, 41, 2),
                                                               (42, 21, 42, 1),
                                                               (43, 22, 43, 4),
                                                               (44, 22, 44, 3),
                                                               (45, 23, 45, 5),
                                                               (46, 23, 46, 2),
                                                               (47, 24, 47, 4),
                                                               (48, 24, 48, 1),
                                                               (49, 25, 49, 2),
                                                               (50, 25, 50, 3);
-- Chèn 50 dữ liệu vào bảng orders
INSERT INTO orders (id, description, status, total_amount, user_id) VALUES
                                                                        (1, 'Order for electronics, includes laptop and accessories', 'ORDER_INIT', 1500.500, 1),
                                                                        (2, 'Clothing order with jackets and shoes', 'ORDER_SUCCESS', 120.250, 2),
                                                                        (3, 'Grocery items, fruits and vegetables', 'DELIVERY_SUCCESS', 75.000, 3),
                                                                        (4, 'Furniture order, includes sofa and coffee table', 'ORDER_PROCESSING', 700.999, 4),
                                                                        (5, 'Books and study materials order', 'ORDER_INIT', 80.000, 5),
                                                                        (6, 'Food delivery, pizza and pasta', 'DELIVERY_FAIL', 25.500, 6),
                                                                        (7, 'Mobile phone order, includes phone case', 'ORDER_FAIL', 600.000, 7),
                                                                        (8, 'Stationery order, includes pens and notebooks', 'PREPARE_PRODUCT', 15.000, 8),
                                                                        (9, 'Home decor, includes vases and cushions', 'ORDER_CANCLE', 50.000, 9),
                                                                        (10, 'Toys and games for kids', 'DELIVERY_SUCCESS', 200.750, 10),
                                                                        (11, 'Order for kitchen appliances, includes blender and toaster', 'ORDER_INIT', 180.000, 11),
                                                                        (12, 'Order for gym equipment, includes dumbbells', 'ORDER_PROCESSING', 150.000, 12),
                                                                        (13, 'Smartwatch and accessories', 'DELIVERY_FAIL', 250.000, 13),
                                                                        (14, 'Cosmetics and skincare products', 'ORDER_SUCCESS', 75.000, 14),
                                                                        (15, 'Jewelry order, includes rings and bracelets', 'ORDER_FAIL', 500.000, 15),
                                                                        (16, 'Pet supplies, includes dog food and toys', 'ORDER_INIT', 40.000, 16),
                                                                        (17, 'Order for car accessories, includes seat covers', 'DELIVERY_SUCCESS', 150.000, 17),
                                                                        (18, 'Sports equipment, includes basketball and soccer ball', 'ORDER_PROCESSING', 120.000, 18),
                                                                        (19, 'Order for travel accessories, includes suitcase', 'ORDER_CANCLE', 90.000, 19),
                                                                        (20, 'Luggage set, order for a family trip', 'ORDER_SUCCESS', 320.000, 20),
                                                                        (21, 'Order for educational toys', 'PREPARE_PRODUCT', 35.000, 21),
                                                                        (22, 'Clothing for winter, includes jackets and scarves', 'DELIVERY_SUCCESS', 85.000, 22),
                                                                        (23, 'Gardening tools, includes shovel and gloves', 'ORDER_FAIL', 60.000, 23),
                                                                        (24, 'Subscription box for monthly snacks', 'ORDER_INIT', 40.500, 24),
                                                                        (25, 'Order for tech gadgets, includes mouse and keyboard', 'DELIVERY_FAIL', 110.000, 25),
                                                                        (26, 'Subscription for streaming services', 'ORDER_SUCCESS', 15.000, 26),
                                                                        (27, 'Gifts for birthday party, includes balloons and decorations', 'ORDER_PROCESSING', 30.000, 27),
                                                                        (28, 'Camping gear, includes tent and sleeping bag', 'DELIVERY_SUCCESS', 200.000, 28),
                                                                        (29, 'Food and beverage order, includes coffee and snacks', 'ORDER_CANCLE', 15.500, 29),
                                                                        (30, 'Order for home renovation materials', 'ORDER_INIT', 500.000, 30),
                                                                        (31, 'Fitness accessories, includes yoga mat and resistance bands', 'PREPARE_PRODUCT', 60.000, 31),
                                                                        (32, 'Order for wine and snacks', 'ORDER_SUCCESS', 100.000, 32),
                                                                        (33, 'Camera equipment, includes lenses and tripods', 'DELIVERY_FAIL', 850.000, 33),
                                                                        (34, 'Order for baby products, includes diapers and baby wipes', 'ORDER_PROCESSING', 50.000, 34),
                                                                        (35, 'Art supplies, includes paints and brushes', 'ORDER_SUCCESS', 45.000, 35),
                                                                        (36, 'Personal care items, includes soap and shampoo', 'ORDER_FAIL', 25.000, 36),
                                                                        (37, 'Smart home devices, includes smart lights', 'DELIVERY_SUCCESS', 180.000, 37),
                                                                        (38, 'Office furniture, includes desk and chair', 'ORDER_INIT', 350.000, 38),
                                                                        (39, 'Order for musical instruments, includes guitar', 'ORDER_PROCESSING', 200.000, 39),
                                                                        (40, 'Order for gift baskets', 'ORDER_FAIL', 70.000, 40),
                                                                        (41, 'Travel booking order, includes flight tickets', 'ORDER_SUCCESS', 500.000, 41),
                                                                        (42, 'Hiking boots and gear', 'DELIVERY_SUCCESS', 120.000, 42),
                                                                        (43, 'Health supplements, includes vitamins and protein powder', 'ORDER_INIT', 90.000, 43),
                                                                        (44, 'Decorative lamps and lighting', 'ORDER_CANCLE', 65.000, 44),
                                                                        (45, 'Cameras and accessories, includes action camera', 'DELIVERY_FAIL', 400.000, 45),
                                                                        (46, 'Video games and consoles', 'ORDER_PROCESSING', 300.000, 46),
                                                                        (47, 'Order for winter boots', 'ORDER_SUCCESS', 75.000, 47),
                                                                        (48, 'Order for books and magazines', 'PREPARE_PRODUCT', 25.000, 48),
                                                                        (49, 'Musical accessories, includes sheet music and instruments', 'ORDER_INIT', 40.000, 49),
                                                                        (50, 'Home cleaning products, includes vacuum and cleaning supplies', 'DELIVERY_SUCCESS', 80.000, 50);
-- Chèn 50 dữ liệu vào bảng order_items
INSERT INTO order_items (id, order_id, product_id, original_price, price) VALUES
                                                                              (1, 1, 1, 500.000, 450.000),
                                                                              (2, 1, 2, 100.000, 90.000),
                                                                              (3, 2, 3, 200.000, 180.000),
                                                                              (4, 2, 4, 150.000, 140.000),
                                                                              (5, 3, 5, 250.000, 230.000),
                                                                              (6, 3, 6, 180.000, 170.000),
                                                                              (7, 4, 7, 300.000, 270.000),
                                                                              (8, 4, 8, 120.000, 110.000),
                                                                              (9, 5, 9, 200.000, 190.000),
                                                                              (10, 5, 10, 150.000, 140.000),
                                                                              (11, 6, 11, 180.000, 170.000),
                                                                              (12, 6, 12, 80.000, 70.000),
                                                                              (13, 7, 13, 400.000, 360.000),
                                                                              (14, 7, 14, 220.000, 210.000),
                                                                              (15, 8, 15, 50.000, 45.000),
                                                                              (16, 8, 16, 300.000, 270.000),
                                                                              (17, 9, 17, 120.000, 110.000),
                                                                              (18, 9, 18, 160.000, 150.000),
                                                                              (19, 10, 19, 60.000, 55.000),
                                                                              (20, 10, 20, 240.000, 220.000),
                                                                              (21, 11, 21, 280.000, 250.000),
                                                                              (22, 11, 22, 100.000, 90.000),
                                                                              (23, 12, 23, 500.000, 450.000),
                                                                              (24, 12, 24, 150.000, 140.000),
                                                                              (25, 13, 25, 200.000, 180.000),
                                                                              (26, 13, 26, 75.000, 65.000),
                                                                              (27, 14, 27, 300.000, 270.000),
                                                                              (28, 14, 28, 250.000, 230.000),
                                                                              (29, 15, 29, 350.000, 320.000),
                                                                              (30, 15, 30, 180.000, 160.000),
                                                                              (31, 16, 31, 220.000, 200.000),
                                                                              (32, 16, 32, 130.000, 120.000),
                                                                              (33, 17, 33, 600.000, 550.000),
                                                                              (34, 17, 34, 90.000, 80.000),
                                                                              (35, 18, 35, 170.000, 160.000),
                                                                              (36, 18, 36, 120.000, 110.000),
                                                                              (37, 19, 37, 350.000, 310.000),
                                                                              (38, 19, 38, 200.000, 180.000),
                                                                              (39, 20, 39, 90.000, 80.000),
                                                                              (40, 20, 40, 120.000, 110.000),
                                                                              (41, 21, 41, 220.000, 210.000),
                                                                              (42, 21, 42, 150.000, 140.000),
                                                                              (43, 22, 43, 250.000, 230.000),
                                                                              (44, 22, 44, 180.000, 160.000),
                                                                              (45, 23, 45, 400.000, 360.000),
                                                                              (46, 23, 46, 100.000, 90.000),
                                                                              (47, 24, 47, 500.000, 470.000),
                                                                              (48, 24, 48, 200.000, 180.000),
                                                                              (49, 25, 49, 120.000, 110.000),
                                                                              (50, 25, 50, 300.000, 270.000);





