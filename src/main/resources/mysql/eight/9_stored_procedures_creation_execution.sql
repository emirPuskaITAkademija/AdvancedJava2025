-- Stored Procedures
-- Uskladištene Procedure
--  Kreirati STORED PROCEDURE
-- npr. ona će nam dopustiti da proslijedimo character_name i race_id
-- stored procedura će te podatke staviti u odgovarajuću tabelu u bazi podataka
-- Zatim ćemo ponovno uraditi QUERY/upit unutar iste STORED procedure
-- i ona će nam vratiti novu verziju podataka unutar characters
-- za odgovarajući race_id
DROP PROCEDURE IF EXISTS movies.char_race;

DELIMITER $$

CREATE PROCEDURE movies.char_race(IN name VARCHAR(30), IN race INT)
BEGIN
   -- rid is the race_id for filtering
   INSERT INTO characters (character_name, race_id)
   VALUES (name, race);
   
   SELECT character_id, character_name, race_name
   FROM characters c 
   JOIN races r ON c.race_id=r.race_id;
   
END$$
DELIMITER ;


CALL char_race('Andrej', 12);
CALL char_race('Tarik', 3);
CALL char_race('Faruk', 4);