-- Vježba 1
-- Uraditi upit na tabelu order_items. 
-- Zadatak: dohvatiti ili selektovati sve stavke narudžbe
-- čiji je order_id=2  i SORTIRATI DESC po TOTAL PRICE.
SELECT *, quantity*unit_price as 'Total Price'
FROM order_items
WHERE order_id=2
ORDER BY quantity*unit_price DESC;