-- INNER JOIN 
-- OUTER JOIN
-- Nešto nedostaje ? 
-- Biznis zahtjev: 
-- Prikaži mi sve kupce( i one koji imaju vezu sa order i one koji nemaju)
--  OUTER JOIN
-- 1. LEFT OUTER JOIN 
-- 2. RIGHT OUTER JOIN 
USE store;
SELECT 
    c.customer_id,
    c.first_name, 
    o.order_id
FROM customers c
LEFT JOIN orders o 
   ON c.customer_id = o.customer_id;