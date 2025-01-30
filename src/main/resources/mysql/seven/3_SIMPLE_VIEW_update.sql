-- Cool stvar kad su u pitanju VIEWs
-- VIEW je UPDATABLE
USE movies;
SELECT * FROM scifi;

UPDATE scifi
SET movie_title='Umjetna Inteligencija'
WHERE movie_id=15;
-- Izmjena podatka unutar VIEW može biti trajna i izmijeniti
-- isti podatak u TABELI s kojom je VIEW povezan
SELECT *
FROM movies;