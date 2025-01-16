-- SELECT, INSERT
-- UPDATE single row
UPDATE invoices
SET payment_total=10, payment_date='2025-01-16'
WHERE invoice_id=1;