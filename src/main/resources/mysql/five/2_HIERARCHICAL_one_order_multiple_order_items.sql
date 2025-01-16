-- Query ispod :
-- insertuje jedan red u tabelu orders
-- i jedan red u tabelu order_items
-- Ovaj order_items -> referencira se na order_id


INSERT 
INTO orders 
(customer_id, order_date, status)
VALUES(1, '2025-01-16', 1);

INSERT
INTO order_items
VALUES
(last_insert_id(), 1, 3, 2.95),
(last_insert_id(), 5, 1, 2.95),
(last_insert_id(), 8, 3, 2.95),
(last_insert_id(), 6, 23, 2.95)
;  

-- 12 -> 1 
-- 12 -> 5 
-- 12 -> 8  2
