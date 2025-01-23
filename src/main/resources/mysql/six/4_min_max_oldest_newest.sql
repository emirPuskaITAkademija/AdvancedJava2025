USE sakila;
SELECT * FROM film;

SELECT 
	min(release_year) AS 'Oldest release year'
FROM film;

SELECT 
	max(release_year) AS 'Newest release year'
FROM film;