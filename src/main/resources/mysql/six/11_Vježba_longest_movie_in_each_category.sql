-- Vježba 5
-- Najduži film u svakoj kategoriji
-- Res: categoryName, filmTitle, max_length
SELECT
  c.name AS category_name, 
  f.title AS film_title, 
  max(f.length) AS max_length
FROM category c
JOIN film_category fc ON c.category_id=fc.category_id
JOIN film f ON fc.film_id=f.film_id
GROUP BY c.category_id
ORDER BY max_length;