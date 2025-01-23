-- Vježba 2
-- Prikazati broj filmova po kategoriji
-- Pri tome sortirati opadajuće po broju filmova
SELECT 
	c.name AS 'Category', fc.category_id, count(fc.film_id) AS film_count
FROM film_category fc
JOIN category c ON fc.category_id=c.category_id
GROUP BY fc.category_id
ORDER BY film_count DESC;
