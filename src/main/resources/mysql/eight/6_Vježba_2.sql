-- Vježba 2
-- Kreirati UPIT čiji će rezultat biti vaš omiljeni movie_id
-- movie_title i ukoliko je vaš omiljeni žanr u pitanju
-- onda kao treću kolonu dodati 'OMILJENI',
-- ili ako je omiljeniji 'OMILJENIJI'
-- ili ako je vaš najdraži žanr 'NAJOMILJENIJI'
USE movies;
SELECT 
	m.movie_id, 
    m.movie_title,
    g.genre_title, 
    g.genre_id,
    CASE m.genre_id
		WHEN 1 THEN 'OMILJENI'
        WHEN 2 THEN 'OMILJENIJI'
        WHEN 5 THEN 'NAJOMILJENIJI'
        ELSE 'NEOMILJENI'
	END as genre
FROM movies m
JOIN genres g ON m.genre_id=g.genre_id