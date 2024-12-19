-- Vježba 5 i 6
-- Step 1:
-- Dohvatiti sve kupce čije adrese 
-- sadrže TRAIL or AVENUE
SELECT *
FROM customers
WHERE address LIKE '%TRAIL%' OR address LIKE '%AVENUE%';

-- STEP 2:
-- Sve kupce čiji phone number ends with 9
SELECT *
FROM customers 
WHERE phone LIKE '%9';
