-- Broj filmova u kojima je 
-- glumac glumio 
-- REZULTAT
-- first_name, last_name, ukupan_broj_filmova
SELECT 
	a.first_name, 
    a.last_name, 
    count(fa.film_id) AS ukupan_broj_filmova
FROM actor a
JOIN film_actor fa ON fa.actor_id=a.actor_id
GROUP BY a.actor_id
ORDER BY ukupan_broj_filmova DESC;