DROP TABLE IF EXISTS Item;

CREATE TABLE Item (
    id IDENTITY PRIMARY KEY,
    code VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    pack_unit VARCHAR(255),
    pack_size VARCHAR(255),
    standard_unit VARCHAR(255),
    sale_price DOUBLE
);
