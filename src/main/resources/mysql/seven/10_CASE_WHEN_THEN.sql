-- Control Flows
-- Java: switch - case - break
-- MySQL: CASE operator
--        WHEN - THEN
-- CASE operator nam omogući da 
-- 1. dohvatimo neki podatak iz naše baze(kolona i ćelija u nekom redu) 
-- 2. Na dohvaćenom podatku možemo npr. uraditi neku kalkulaciju
-- 3. Na osnovu rezultata kalkulacije odlučiti 
-- možemo da li ćemo rezultat ubaciti u ResultSet
USE movies;
SELECT 
	m.movie_id,
    m.movie_title, 
    CASE m.genre_id
		WHEN 1 THEN 'Cool Žanr'
        WHEN 2 THEN 'Futuristički Žanr'
        WHEN 123 THEN 'Nešto drugo'
        ELSE CONCAT('GENRE ID : ', m.genre_id)
    END AS genre
FROM movies AS m;