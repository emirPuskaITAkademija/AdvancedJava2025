-- Iskoristiti kreiranu funkciju 
USE movies;
SELECT
   p.person_id,
   full_name(p.first_name, p.last_name) as full_name
FROM people p