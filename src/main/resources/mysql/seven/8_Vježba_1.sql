-- Vježba 1
-- Kao rezultat prikazati sljedeće
-- total, genre_title, director
-- total: se odnosi na ukupan broj filmova specifičnog žanra

SELECT 
	count(m.movie_id) AS 'Ukupan broj filmova spec žanra',
    g.genre_title,
    m.director
FROM movies m
JOIN genres g ON g.genre_id=m.genre_id
GROUP BY g.genre_title, m.director;