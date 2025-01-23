--  SUM 
USE sakila;
SELECT * FROM film;

SELECT 
   sum(rental_duration) AS 'Total rental duration'
FROM film; 