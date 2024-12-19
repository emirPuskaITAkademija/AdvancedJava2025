-- Vježba 
-- Tabela: orders
-- Dohvatite sve narudžbe iz 2018 godine
-- UPGRADE: Napisati query koji dohvaća sve narudžbe iz TEKUĆE
-- GODIne
SELECT *
FROM orders
WHERE order_date>='2018-01-01' AND order_date<='2018-12-31';