-- Želim da napišete query koji će proizvesti sljedeći rezultat.
-- product_id, name, quantity
-- TABELE: products i order_items
-- ALI želim da prikažete sve proizvode bez obzira da li su ili ne
-- bili dio neke narudžbe

USE store;
SELECT  
  p.product_id,
  p.name, 
  oi.quantity
FROM products p 
LEFT OUTER JOIN order_items oi
  ON oi.product_id = p.product_id;
  