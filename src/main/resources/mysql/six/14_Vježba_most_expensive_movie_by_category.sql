-- Najskuplji film po kategoriji
-- (skupo => najveća cijena zamjene)
-- Rezultat:
-- category_name, film_title, max_replacement_cost


SELECT 
	c.name AS category_name, 
    f.title AS film_title, 
    MAX(f.replacement_cost) AS max_replacement_cost
FROM category c
JOIN film_category fc ON fc.category_id=c.category_id
JOIN film f ON fc.film_id=f.film_id
GROUP BY c.category_id
ORDER BY max_replacement_cost;