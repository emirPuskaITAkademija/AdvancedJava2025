-- CROSS JOIN 
-- Kada želimo da kombinujemo svaki red/zapis
-- iz prve tabele sa svakim redom i druge tabele

-- EKSPLICITNA sintaksa
SELECT 
   c.first_name AS customer, 
   p.name AS product
FROM customers c
CROSS JOIN products p 
ORDER BY c.first_name;

-- IMPLICITNA 
SELECT 
   c.first_name AS customer, 
   p.name AS product
FROM customers c
JOIN products p 
ORDER BY c.first_name;