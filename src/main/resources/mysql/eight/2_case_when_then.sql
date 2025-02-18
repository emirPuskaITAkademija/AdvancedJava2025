-- CASE operator

USE movies;
SELECT 
	m.movie_id, 
    m.movie_title,
    CASE g.genre_id
       WHEN 1 THEN 'Nadrealno'
       WHEN 2 THEN 'Futuristicki'
       WHEN 3 THEN 'Akcioni'
       WHEN 4 THEN 'Smjehofilm'
       ELSE concat('Genre ID: ', g.genre_id, ' ', g.genre_title)
	END as genre
FROM movies m
JOIN genres g ON m.genre_id=g.genre_id