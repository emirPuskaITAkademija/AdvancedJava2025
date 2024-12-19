-- Sortiranje podataka
-- ORDER BY
SELECT *
FROM customers
ORDER BY state DESC, first_name ASC;

SELECT first_name, last_name, birth_date
FROM customers
ORDER BY birth_date;

-- Sortiranje po POZICIJAMA
SELECT first_name, last_name, 10 as points
FROM customers
ORDER BY 1, 2 -- IZBJEGAVAM