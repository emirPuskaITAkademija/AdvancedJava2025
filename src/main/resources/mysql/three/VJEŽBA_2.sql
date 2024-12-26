-- Dohvatiti tri top lojalna kupca
-- Lojalnost se mjeri po poenima
SELECT *
FROM customers
ORDER BY points DESC
LIMIT 3;