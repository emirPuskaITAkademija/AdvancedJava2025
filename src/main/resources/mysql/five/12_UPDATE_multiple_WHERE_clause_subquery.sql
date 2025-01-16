-- VJEŽBA
-- Ažurirati svim klijentima iz 'CA' 'NY' plaćanja.
-- Dobili smo dojavu da su svi platili 50 % na datum prispijeća fakture(due_date)
USE invoicing;
UPDATE invoices
SET 
	payment_total=invoice_total*0.5,
    payment_date=due_date
WHERE client_id IN (SELECT client_id
FROM clients
WHERE state IN ('CA', 'NY'));