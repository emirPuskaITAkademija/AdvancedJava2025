-- Agregatne funkcije(count, min, max, sum itd..) lijepo prijanjaju 
-- na grupu redova koju na neki način grupišemo po zajedničkom parametru
-- (prethodni primjer client_id)
USE sakila;
SELECT * FROM film;
SELECT 
	count(f.film_id) AS 'Ukupan broj filmova', 
    f.rental_duration
FROM film f
GROUP BY f.rental_duration;