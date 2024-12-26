-- orders     -> customer_id
-- customers  -> customer_id
-- order_statuses -> status narudžbe
-- REZULTAT spajanja: 
-- order_id, order_date, first_name, last_name, status(kao name)
SELECT 
	o.order_id,
    o.order_date,
    c.first_name, 
    c.last_name, 
    os.name AS status
FROM orders o 
JOIN customers c 
	ON o.customer_id=c.customer_id
JOIN order_statuses os 
	ON o.status=os.order_status_id;