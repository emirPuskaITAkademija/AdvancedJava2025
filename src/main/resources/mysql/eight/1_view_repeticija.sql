-- virtuelna tabela - query result

-- CREATE VIEW 
USE movies;
CREATE VIEW scifi AS
SELECT 
  m.movie_id, 
  m.movie_title,
  g.genre_title
FROM movies m
JOIN genres g ON m.genre_id=g.genre_id
WHERE genre_title='Sci-Fi';