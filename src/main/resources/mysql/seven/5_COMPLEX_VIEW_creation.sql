-- Kada ažuriramo podatke unutar VIEW ipak postoje OGRANIČENJA.
-- UPDATABLE VIEWS ne mogu uključivati unutar sebe :
-- 1. AGREGATNE funkcije
-- 2. GROUP BY
-- 3. HAVING
-- 4. DISTINCT
-- 5. LEFT/RIGHT(OUTER) JOINS
-- 6. SUBQUERIES
-- VAŽNO : Ažuriranje ili UPDATE average_consuming_time VIEW nije moguć
USE sakila;
CREATE VIEW average_consuming_time AS
SELECT 
  c.name AS 'Category Name', 
  c.category_id, 
  avg(f.length) AS average_length
FROM category c
JOIN film_category fc ON c.category_id=fc.category_id
JOIN film f ON fc.film_id=f.film_id
GROUP BY c.name
ORDER BY average_length;