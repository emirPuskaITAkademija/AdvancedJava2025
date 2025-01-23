-- Vježba 3
-- Ukupan broj glumaca po filmu
-- film title, film id, broj glumaca
SELECT 
	f.title, 
    f.film_id, 
    count(actor_id) AS actor_count
FROM film f
JOIN film_actor fc ON fc.film_id=f.film_id
GROUP BY f.film_id
ORDER BY actor_count DESC;