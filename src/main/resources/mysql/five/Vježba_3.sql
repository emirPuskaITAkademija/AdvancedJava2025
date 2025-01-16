-- store BAZA
-- orders TABELA: kolona comments
-- ŽELIM da napišete UPDATE statement i ažurirate
-- komentar svih kupaca koji imaju više od 3000 poena
-- Kao komentar stavite : "ZLATNI KUPCI"
USE store;
UPDATE orders
SET comments='ZLATNI KUPAC'
WHERE customer_id IN (
	SELECT customer_id
    FROM customers
    WHERE points>3000
);