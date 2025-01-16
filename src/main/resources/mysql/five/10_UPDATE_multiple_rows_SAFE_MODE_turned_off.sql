-- Vježba 
-- Dajte svim customers rođenim prije 1990
-- 50 ekstra poena
USE store;
UPDATE customers
SET 
	points=points+50
WHERE birth_date<='1990-01-01';