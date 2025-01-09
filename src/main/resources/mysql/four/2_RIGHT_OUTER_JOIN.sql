-- Želim da koristimo RIGHT OUTER JOIN, 
-- a da pri tome dobijemo sve kupce bez obzira da li su radili 
-- /kreirali narudžbe u sistemu ili ne
USE store;
SELECT 
    c.customer_id,
    c.first_name, 
    o.order_id
FROM orders o
RIGHT JOIN customers c 
   ON c.customer_id = o.customer_id;