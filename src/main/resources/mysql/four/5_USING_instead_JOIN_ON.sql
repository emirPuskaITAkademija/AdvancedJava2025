-- store baza
-- USLOV korištenja USING: isto se moraju zvati kolone 
-- preko kojih su povezani podaci
USE store;
SELECT 
 o.order_id, 
 c.first_name, 
 sh.name
FROM orders o 
JOIN customers c USING (customer_id)
 --  ON o.customer_id=c.customer_id; -- isto se zovu kolone u različitim tabelam
LEFT JOIN shippers sh USING (shipper_id);