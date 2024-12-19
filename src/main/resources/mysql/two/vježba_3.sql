-- Vježba 3
-- Dohvatiti sve proizvode čiji je 
-- quantity in stock jednak 49, 38, 72
SELECT *
FROM products
WHERE quantity_in_stock IN (49, 38, 72);