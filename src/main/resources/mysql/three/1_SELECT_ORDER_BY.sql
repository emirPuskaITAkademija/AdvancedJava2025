-- The ORDER BY 
SELECT *
FROM customers
ORDER BY state, first_name ASC;

SELECT * 
FROM customers
ORDER BY birth_date;

-- Ovo ispod nije preporučen način, ali je tehnički ispravan
SELECT first_name, last_name
FROM customers
ORDER BY 1, 2;