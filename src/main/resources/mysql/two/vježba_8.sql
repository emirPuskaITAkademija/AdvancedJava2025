-- Vježba 8
-- Dohvati sve narudžbe koji nisu isporučene ili not shipped
SELECT *
FROM orders
WHERE shipped_date IS NULL AND shipper_id IS NULL;