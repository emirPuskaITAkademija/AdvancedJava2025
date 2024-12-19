-- REGEXP
SELECT *
FROM customers
-- WHERE last_name LIKE '%field%';
WHERE last_name REGEXP 'field';
 
-- ^ CARROT ako ga stavimo na početku ^field(last_name mora početi sa field)
SELECT *
FROM customers
WHERE last_name REGEXP '^field';
-- $ DOLLAR ako na kraj field$
SELECT *
FROM customers
WHERE last_name REGEXP 'field$';
-- Zašto nismo MOGLI OSTAT jednostavno na LIKE samo?
-- GDJE JE prednost i postoji li ona ? 
-- Problem: želimo dohvatiti kupve čije prezime
-- sadrži 'field' ili 'mac'.

SELECT *
FROM customers
WHERE last_name REGEXP 'field$|mac|rose';
-- WHERE last_name LIKE '%field%' OR last_name LIKE '%mac%';



