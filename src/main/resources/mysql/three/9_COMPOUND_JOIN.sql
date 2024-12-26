-- COMPOUND JOIN CONDITION
-- Šta smo mi radili do sada ? 
-- Kako smo mi spajali redove iz više tabela ? 
-- ODGOVOR: spajali preko jedne kolone iz jedne tabele
-- Kakve veze priča sa kompozitnim PK ima sa JOIN ?
-- ODGOVOR: order_item_notes
-- NPR: Selektovati samo one stavke uz koje ima neki note

USE store;
SELECT *
FROM order_items oi
JOIN order_item_notes oin
	ON oi.order_id = oin.order_Id
    AND oi.product_id = oin.product_id;