-- The AND, OR or NOT operator
-- Zamislite da želimo kombinovati 
-- 1. sve customers rođene poslije 01.01.1990
-- 2. koji uz to imaju više od 1000 poena
SELECT *
FROM customers
-- WHERE birth_date>'1990-01-01' AND points>1000;

WHERE birth_date>'1990-01-01' OR points>1000;