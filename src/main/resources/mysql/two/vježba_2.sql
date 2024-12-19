-- Iz tabele order_items 
-- Dohvati mi sve stavke narudžbe sa ID=6
-- kod kojih je total price veći od 30

SELECT * , (unit_price*quantity) AS 'Total Price'
FROM order_items
WHERE order_id=6 AND (unit_price*quantity)>30;