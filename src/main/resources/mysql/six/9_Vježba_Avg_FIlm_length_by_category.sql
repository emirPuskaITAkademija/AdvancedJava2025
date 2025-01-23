-- Vježba 3
-- Izračunajte prosječno trajanje filmova po kategoriji
-- Sortirati opadajuće po prosječnom trajanju
-- Rezultat: Category Name, Category ID, Prosječno trajanje filma
USE sakila;
SELECT 
  c.name AS 'Category Name', 
  c.category_id, 
  avg(f.length) AS average_length
FROM category c
JOIN film_category fc ON c.category_id=fc.category_id
JOIN film f ON fc.film_id=f.film_id
GROUP BY c.name
ORDER BY average_length;
