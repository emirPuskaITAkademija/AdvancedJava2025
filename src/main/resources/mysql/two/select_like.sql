-- LIKE 
-- PROBLEM : želimo dohvatiti sve customers
-- čiji last_name počinje b
SELECT *
FROM customers
WHERE last_name LIKE 'brush%';-- Napomena 'b' ili 'B' je ispravno

-- % ili PERCENT ne mora biti na kraju PATTERN
-- Želimo da riječ STARTS WITH -> NA KRAJ %
--                 ENDS WITH -> NA POČETAK %
--                 CONTAINS -> NA POČETAK i KRAJ % %

SELECT * 
FROM customers
WHERE last_name LIKE '%y';