-- Kreiramo UNIJU tako što selektujemo first_name tabele customers
-- name iz tabele shippers i kombinujemo ih u jedan RESULT SET
SELECT 
  first_name, last_name
FROM customers
UNION
SELECT 
  name 
FROM shippers;