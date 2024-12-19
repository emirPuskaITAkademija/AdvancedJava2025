
-- Vježba
-- Selektuj sve products 
-- kolone: name, unit price, new price(unit price uvećana za 10 %)

USE store;
SELECT name, unit_price, unit_price*1.1 AS 'New Price'
FROM products;