-- Vježba 1
-- Kreirati UPIT čiji će rezultat biti vaš omiljeni movie_id
-- movie_title i ukoliko je vaš omiljeni žanr u pitanju
-- onda kao treću kolonu dodati 'MOJ OMILJENI ŽANR', a inače
-- upisati 'NIJE MOJ OMILJENI ŽANR'

USE movies;
SELECT 
	m.movie_id, 
    m.movie_title,
    g.genre_title, 
    g.genre_id,
    if(m.genre_id=5,'MOJ OMILJENI', 'NIJE MOJ OMILJENI') as genre
FROM movies m
JOIN genres g ON m.genre_id=g.genre_id