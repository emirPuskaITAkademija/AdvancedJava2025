-- UPDATE MULTIPLE ROWS
-- npr. izdamo nekom kupcu 5 faktura i želimo 
-- ih sve izmijeniti client_id=3

UPDATE invoices
SET 
	payment_total=invoice_total*0.5,
    payment_date=due_date
WHERE client_id=3;