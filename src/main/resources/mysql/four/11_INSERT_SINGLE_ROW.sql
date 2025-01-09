-- VARCHAR(50) -> tip podatka vezan za kolonu
-- možemo imati maksimalno u toj koloni podatak
-- dug 50 , ali možemo primiti i manje od 50 

-- CHAR(50) -> ima fiksnu duzinu karakteru i vrlo često neefikasan 
-- ako mi ubacimo 3 karaktera MySQL će insertovati dodatne spaces 
-- da zadovolji 50 duzinu. NEPOTREBNO gubimo memory space


INSERT INTO customers
VALUES(DEFAULT, 'John', 'Doe', '1990-01-01', NULL, 'Zmaja od noćaja','Sarajevo', 'BA', DEFAULT);

INSERT INTO customers(first_name,last_name,birth_date, address, city, state)
VALUES('Tarik', 'Bulic', '1980-01-01', 'Zmaja od Bosne','Gradačac', 'BA')