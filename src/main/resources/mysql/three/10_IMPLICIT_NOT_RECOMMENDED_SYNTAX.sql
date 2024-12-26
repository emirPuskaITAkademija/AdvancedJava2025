-- IMPLICIT JOIN sintaksa
SELECT *
FROM orders o 
JOIN customers c
	ON o.customer_id=c.customer_id;
    
-- ISTI JOIN napisan na drugačiji način je ispod
-- Kada su imena kolona u različitim tabelama ISTA
-- WHERE postiže isto što i JOIN ON
SELECT *
FROM orders o, customers c
WHERE o.customer_id=c.customer_id;

-- Iako MYSQL podržava ovu na izgled JEDNOSTAVNU sintaksu
-- SUBJEKTIVNA PREPORUKA: NE PREPORUČUJEM
-- ZAŠTO ????
-- Vrlo često zaboravimo WHERE i dobijemo CROSS JOIN 
-- CROSS JOIN : ako imamo tabela1 sa 10 redova i tabela2 sa 15 redova
-- Rezultat CROSS JOINA je 10*15=150 result set
