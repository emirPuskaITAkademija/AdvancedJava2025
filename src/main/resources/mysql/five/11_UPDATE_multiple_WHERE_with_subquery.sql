USE invoicing;
UPDATE invoices
SET 
	payment_total=invoice_total*0.5,
    payment_date=due_date
WHERE client_id=(SELECT client_id
FROM clients 
WHERE name='Myworks');

-- Šta ako ne znamo client_id nego samo znamo client name ? 

;
