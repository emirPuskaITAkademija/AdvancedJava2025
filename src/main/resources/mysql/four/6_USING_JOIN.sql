-- USING can/cannot be used

-- DA ili NE -> DA
SELECT *
FROM order_items oi
JOIN order_item_notes oin 
 USING (order_id, product_id);
--   ON oi.order_id=oin.order_id AND oi.product_id=oin.product_id;