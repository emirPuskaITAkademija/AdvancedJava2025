
USE sakila;
SELECT * FROM average_consuming_time;

-- Ne možemo ažurirati ovaj VIEW odnosno njegovu kolonu average_length
-- ZAŠTO: Ona ne postoji u TABELI iz koje je VIEW nastao
-- Ta kolona je produkt spajanja više redova i primjene neke operacije u našem slučaju 
-- avg - izračun srednje vrijednosti
UPDATE average_consuming_time
SET average_length=100
WHERE category_id=14;