-- SELECT * -> selektuje sve kolone 
-- 
-- Ovo nekada nije dobro koristiti. 
SELECT first_name, last_name, (points+10)*1000 AS 'Discount factor'
FROM customers;

