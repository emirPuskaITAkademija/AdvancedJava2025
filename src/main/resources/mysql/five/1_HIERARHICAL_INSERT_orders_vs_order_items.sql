INSERT 
INTO orders 
(customer_id, order_date, status)
VALUES(1, '2025-01-16', 1);

INSERT
INTO order_items
VALUES(last_insert_id(), 1, 3, 2.95);
