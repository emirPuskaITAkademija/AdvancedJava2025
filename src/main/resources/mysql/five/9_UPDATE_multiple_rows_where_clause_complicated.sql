-- Npr. imamo 2 klijenta čije payment želimo postaviti na isti način
-- client_id=3 i 4

UPDATE invoices
SET 
	payment_total=invoice_total*0.5,
    payment_date=due_date
WHERE client_id IN (3,4)