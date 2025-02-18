-- TEST trigger 
-- Šta sam ja uradio pri insertu ? 
-- insertovao sam character_name='Spiderman'
-- Prije nego se desio insert trigerovao se TRIGGER 
-- koji je to Spiderman prebacio u SPIDERMAN
INSERT INTO characters(character_name, race_id)
VALUES ('Spiderman', 12);