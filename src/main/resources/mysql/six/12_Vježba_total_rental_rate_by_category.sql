-- Ukupna cijena iznajmljivanja
-- filmova po kategorijama
-- Cijenu filma izvuci iz rental_rate
-- Resultat:
-- ukupna_cijena, ime kategorije
SELECT 
	c.name AS category_name, 
    sum(f.rental_rate) AS total_rental_rate
FROM category c
JOIN film_category fc ON fc.category_id=c.category_id
JOIN film f ON fc.film_id=f.film_id
GROUP BY c.category_id
ORDER BY total_rental_rate;