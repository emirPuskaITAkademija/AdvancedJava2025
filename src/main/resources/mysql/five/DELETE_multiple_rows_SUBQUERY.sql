-- Npr. želim da izbrišem klijenta čiji je name='Myworks'
USE invoicing;
DELETE FROM invoices
WHERE client_id IN (
	SELECT client_id
    FROM clients
    WHERE name='Myworks'
);