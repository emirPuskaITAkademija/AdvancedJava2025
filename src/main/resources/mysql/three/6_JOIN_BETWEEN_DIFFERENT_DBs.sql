-- BAZA1 = store -> products X, order_items
-- BAZA2 = inventory-> products
USE store;

SELECT *
FROM order_items oi 
JOIN inventory.products p 
   ON oi.product_id=p.product_id;
   

USE inventory;
SELECT *
FROM products p
JOIN store.order_items oi 
 ON p.product_id=oi.product_id;
