-- Recimo da želimo dohvatiti customers
-- koji su ili rođeni poslije 1990 ili 
-- osobe koje imaju najmanje 1000 poena i pri tome su iz VA
SELECT *
FROM customers
WHERE NOT(birth_date>'1990-01-01' OR (points>1000 AND state='VA'));
-- Kao što MNOŽENJE ima veći prioritet u odnosu na SABIRANJE
-- tako i AND ima veći prioritet u odnosu na OR