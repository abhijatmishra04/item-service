DROP TABLE IF EXISTS Purchase;

CREATE TABLE Purchase (
    id IDENTITY PRIMARY KEY,
    itemCode VARCHAR(255) NOT NULL,
    quantity INT NOT NULL,
    purchaseDate DATE
);
