UPDATE invoices
SET 
	payment_total=invoice_total*0.5,
    payment_date=due_date
WHERE invoice_id=3;