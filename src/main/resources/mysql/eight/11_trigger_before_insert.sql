-- Triggers 
-- Šta je to trigger ? 
-- trigger=okidač
-- Trigger - blok koda ili event query koji se okida ili trigeruje
-- kada se nešto desi .
-- To nešto desi na engleskom se zove EVENT
-- Dakle, kada se nešto desi podacima postoji SQL komanda
-- koja se trigeruje ili izvrši.
-- Npr. Želim da se neki TRIGGER desi kada neko npr INSERTUJE neki red
-- a zatim želim da se TRIGER2 okine kada neko UPDATE uradi tog istog reda
-- ORM alata Hibernate ENVERS 

CREATE TRIGGER tr_ins_char
BEFORE INSERT ON characters
FOR EACH ROW SET NEW.character_name=UPPER(NEW.character_name);
-- NEW ili OLD su ključne riječi