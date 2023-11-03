CREATE TABLE payables
(
    id            BINARY(16)     NOT NULL,
    creation_date DATETIME       NOT NULL,
    update_date   DATETIME       NOT NULL,
    date          DATE           NOT NULL,
    description   VARCHAR(200)   NOT NULL,
    type          VARCHAR(200)   NOT NULL,
    value         DECIMAL(10, 2) NOT NULL,
    payment_code  VARCHAR(1000)  NOT NULL,
    is_deleted    BIT            NOT NULL,

    CONSTRAINT payable_fk PRIMARY KEY (id)
);