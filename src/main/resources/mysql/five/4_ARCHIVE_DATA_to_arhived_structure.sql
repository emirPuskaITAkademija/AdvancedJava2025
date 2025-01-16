-- CILJ uzeti sve podatke iz tabele orders(koje želimo arhivirati)
-- i izmjestiti ih u ciljnu strukturu orders_archived

INSERT INTO orders_archived
SELECT * FROM orders
WHERE order_date<'2018-01-01';