-- Postoji tzv. NULLIF
-- NULLIF(expression1, expression2)
-- expression1 = expression2  onda je NULL
-- expression1 != expression2 onda je expresion1 prikazan
SELECT 
	m.movie_id, 
    m.movie_title, 
    nullif(m.genre_id, 2) AS not_scifi
FROM movies m