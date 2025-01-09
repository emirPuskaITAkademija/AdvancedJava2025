-- Vježba
-- customer_id, first_name, points, type(Type Of Customer)
-- Ukoliko customeri zadovoljavaju next conditions/uslove type vrijednosti su sljedeće:
-- 1. <2000 - BRONZE
-- 2. 2000<=broj poena <3000 SILVER
-- 3. broj poena > 3000 GOLD 
-- Sortirati rezultate po first_name
USE store;
SELECT 
  customer_id, 
  first_name, 
  points, 
  'BRONZE' AS 'Type of customer'
FROM customers
WHERE points<2000
UNION 
SELECT 
  customer_id, 
  first_name, 
  points, 
  'SILVER'
FROM customers
WHERE points>=2000 AND points<3000
UNION 
SELECT 
  customer_id, 
  first_name, 
  points, 
  'GOLD'
FROM customers
WHERE points>=3000
ORDER BY first_name;
