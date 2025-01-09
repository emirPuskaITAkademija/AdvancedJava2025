-- Vježba 
-- Baza: invoicing
-- Želim da znam na koji datum i ko je uradio uplatu i pomoću koje payment
-- metode ? 
-- date, client, amount, payment method name
USE invoicing;
SELECT 
  p.date, 
  c.name AS 'Client', 
  p.amount, 
  pm.name AS 'Payment Method'
FROM clients c
JOIN payments p USING (client_id)
JOIN payment_methods pm 
     ON p.payment_method=pm.payment_method_id;