DROP TABLE IF EXISTS order_lines CASCADE;
DROP TABLE IF EXISTS orders CASCADE;
DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS customers;

CREATE TABLE customers
(
    registration_code INT PRIMARY KEY,
    full_name         VARCHAR(255) NOT NULL,
    email             VARCHAR(100) NOT NULL UNIQUE,
    telephone         VARCHAR(20)  NOT NULL
);

CREATE TABLE products
(
    sku_code     VARCHAR(12) PRIMARY KEY,
    product_name VARCHAR(255) NOT NULL,
    unitPrice    REAL         NOT NULL
);

CREATE TABLE orders
(
    order_id                   SERIAL PRIMARY KEY,
    customer_registration_code VARCHAR(255) NOT NULL,
    orderDate                  DATE         NOT NULL,
    FOREIGN KEY (customer_registration_code) REFERENCES customers (registration_code)

);
CREATE TABLE order_lines
(
    line_id    SERIAL PRIMARY KEY,
    order_id   INTEGER      NOT NULL,
    product_id VARCHAR(255) NOT NULL,
    quantity   INTEGER      NOT NULL,
    FOREIGN KEY (order_id) REFERENCES orders (order_id),
    FOREIGN KEY (product_id) REFERENCES products (sku_code)
)
