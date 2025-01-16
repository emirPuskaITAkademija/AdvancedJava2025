-- Trajno brisanje iz baze : hard delete
-- Deaktiviranje uz neki active=false : soft delete
USE invoicing;
DELETE FROM invoices
WHERE invoice_id=1;