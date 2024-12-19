-- PROBLEM: želimo dohvatiti
-- kupce čije prezime ima slovo 'e' ali prije slova e 
-- mora imati 'g' ili 'm'  ili i 'u' prezimenu
SELECT *
FROM customers
WHERE last_name REGEXP '[gim]e';

-- PROBLEM: ima slovo 'e' a poslije ima 'f' 'm' ili 'l'
SELECT *
FROM customers
WHERE last_name REGEXP 'e[fml]';

-- PROBLEM: ako želimo da ima slova od 'a-h' prije 'e'
SELECT *
FROM customers
WHERE last_name REGEXP '[a-h]e';



-- POČETAK ^
-- KRAJ $
-- | logičko OR
-- [abcd]
-- [a-h]