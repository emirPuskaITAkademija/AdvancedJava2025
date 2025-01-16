-- Vježba 
-- invoicing baza
-- invoices -> arhivirati podatke u invoices_archived
-- ALI ključno ..ne želimo client_id, nego ime klijenta
-- DA BUDE JOŠ interesantnije želimo kopirati 
-- samo one invoices koji su plaćeni(payments)
USE invoicing;

CREATE TABLE invoices_archived AS
SELECT 
	i.invoice_id, 
    i.number, 
    c.name AS client,
    i.invoice_total, 
    i.payment_total,
    i.invoice_date,
    i.due_date,
    i.payment_date
FROM invoices i 
JOIN clients c USING (client_id)
WHERE payment_date IS NOT NULL
ORDER BY invoice_id;