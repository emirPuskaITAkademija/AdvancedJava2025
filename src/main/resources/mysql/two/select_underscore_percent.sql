SELECT *
FROM customers
WHERE last_name LIKE '%y';
-- Imamo takođe i UNDERSCORE 
-- '_Y' - želimo kupca čije prezime treba da bude 
-- tačno 2 karaktera dugo. Ne tiče nas se koji je
-- prvi karakter ali drugi mora biti y

SELECT *
FROM customers
WHERE last_name LIKE '_____y';-- 6 karaktera dugo prezime a zadnji mora biti y



SELECT *
FROM customers
WHERE last_name LIKE 'b____y';

-- SUMMARY
-- % PERCENT-> any number of characters
-- _ UNDERSCORE-> single character
