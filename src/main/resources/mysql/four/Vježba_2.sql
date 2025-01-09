-- Napisati query koji će generisati sljedeći result:
-- order_date, order_id, first_name, shipper, status
-- TABELE: orders, customers, shippers, order_statuses
SELECT
	o.order_date,
    o.order_id,
    c.first_name,
    sh.shipper_id,
    os.name
FROM orders o
JOIN customers c
	ON o.customer_id = c.customer_id
LEFT JOIN shippers sh
	ON o.shipper_id = sh.shipper_id
LEFT JOIN order_statuses os
	ON o.status = os.order_status_id;