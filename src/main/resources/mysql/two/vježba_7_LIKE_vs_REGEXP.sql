-- Vježba 7
-- Dohvati customers/kupce
-- first_name sadrži ELKA ili AMBUR
-- last_name završava sa EY ili ON
-- last_name počinje sa MY ili sadrži SE
-- last_name sadrži B praćeno sa R ili U

-- RJEŠENJE 1
SELECT * 
FROM customers
WHERE first_name REGEXP 'ELKA|AMBUR';
-- WHERE first_name LIKE '%ELKA%' OR first_name LIKE '%AMBUR%';

-- RJEŠENJE 2
SELECT * 
FROM customers
WHERE last_name REGEXP 'ey$|on$';
-- WHERE last_name LIKE '%EY' or last_name LIKE '%ON';

-- RJEŠENJE 3 
SELECT * 
FROM customers
WHERE last_name REGEXP '^my|se';
-- WHERE last_name LIKE 'my%' OR last_name LIKE '%se%'


-- RJEŠENJE 4
SELECT *
FROM customers
WHERE last_name REGEXP 'b[ru]';
