-- Vježba 
-- TABELE: order_items, products 
-- i obratite pažnju na kolone order_id, product_id...
-- Zadatak: napišite query da dohvatite 
-- product_id, ali i njegovo ime, a tu kolonu 
-- neka prate unit_price, quantity iz tabele
-- order_items.

SELECT 
    order_items.order_id,
	order_items.product_id as 'Order Item Product ID',
    products.product_id AS 'Product ID',
    products.name, 
    products.unit_price as 'Product Unit Price', 
    order_items.unit_price as 'Order Items Unit Price',
    order_items.quantity
FROM order_items
JOIN products
 ON order_items.product_id=products.product_id;