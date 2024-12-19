-- The BETWEEN
-- Npr. želimo dohvatiti customers koji imaju 
-- više od 1000 a manje od 3000 poena
SELECT *
FROM customers
WHERE points BETWEEN 1000 AND 3000;
-- WHERE points>=1000 AND points<=3000;