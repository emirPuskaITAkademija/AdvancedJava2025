CREATE TRIGGER tr_up_char
BEFORE UPDATE ON characters
FOR EACH ROW 
SET NEW.character_name = UPPER(NEW.character_name);