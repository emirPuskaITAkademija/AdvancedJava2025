-- Kako kreirati archived tabelu u koju ćemo smjestiti 
-- arhivirane podatke i time rasteretiti našu orders

-- orders_archived - STRUKTURA
CREATE TABLE orders_archived AS
SELECT * FROM orders;