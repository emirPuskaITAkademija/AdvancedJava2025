USE invoicing;
SELECT * FROM invoices;
-- Želim da saznam koja je to najveća faktura
SELECT max(i.invoice_total)
FROM invoices i;
-- Želim da saznam koliko sam kojem klijentu fakturisao ? 
SELECT 
	i.client_id, 
    SUM(i.invoice_total) AS 'Ukupno fakturisano', 
    SUM(i.payment_total) AS 'Ukupno plaćeno'
FROM  invoices i
GROUP BY client_id;