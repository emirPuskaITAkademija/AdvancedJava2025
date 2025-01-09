-- Uradite cross join između tabela
-- shippers, products
-- EKSPLICIT 
-- IMPLICIT

-- RJEŠENJE: eksplicitna
SELECT 
  sh.name AS shipper, 
  p.name AS product
FROM products p
CROSS JOIN shippers sh 
ORDER by sh.name;

-- RJEŠENJE: implicitna
SELECT 
  sh.name AS shipper, 
  p.name AS product
FROM products p, shippers sh 
ORDER by sh.name;