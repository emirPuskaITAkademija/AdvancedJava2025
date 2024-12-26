-- BAZA: invoicing i tabela payments
-- TRI TABELE: payments, clients, payment_methods
-- ZADATAK: Napravi mi izvještaj koji će prikazati ime klijenta
-- i ime payment metode kojom je on platio.
SELECT 
	p.date,
    p.invoice_id, 
    p.amount, 
    c.name AS 'Client Name', 
    pm.name AS 'Payment Method Name'
FROM payments p
JOIN clients c
	ON p.client_id=c.client_id
JOIN payment_methods pm 
	ON p.payment_method=pm.payment_method_id;