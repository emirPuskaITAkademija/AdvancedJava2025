
SELECT 
   oi.order_id, 
   oi.product_id, 
   p.name,
   oi.quantity, 
   oi.unit_price
FROM order_items oi
JOIN products p 
   ON oi.product_id=p.product_id;