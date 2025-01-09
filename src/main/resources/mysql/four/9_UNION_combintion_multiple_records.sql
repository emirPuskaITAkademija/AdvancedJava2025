-- Naučili smo kombinovati POMOĆU KOLONA različitih 
-- između različtih/istih tabela podatke.

-- Međutim, šta ako bih vam rekao da možemo 
-- kombinovati POMOĆU REDOVA podatke iz više tabela
-- Šta ako bih vam rekao da je to MOĆNA stvar ? 
-- UNIONS
SELECT 
   order_id, 
   order_date, 
   'Active' AS status
FROM orders
WHERE order_date>='2018-01-01'
UNION
SELECT 
  order_id, 
  order_date,
  'Archived' AS status
FROM orders 
WHERE order_date<'2018-01-01';