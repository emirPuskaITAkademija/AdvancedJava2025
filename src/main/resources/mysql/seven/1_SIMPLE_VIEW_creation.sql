-- Danas ćemo pričati o VIEWS ili POGLEDIMA
-- Šta je to VIEW ? 
-- jedan od odgovora: virtuelna TABELA
-- možete ga zamisliti i kao QUERY result
-- Zašto on postoji ???
-- Šta će nam ? ?
-- jako kompleksne JOIN query -- svaki dan ih pišemo..
-- VIEW -> jednostavno kreiram SELECT i onda dobijem RESULT - proglasim VIEW
CREATE VIEW scifi AS
SELECT 
	m.movie_id,
    m.movie_title,
    g.genre_title
FROM movies m
JOIN genres g ON m.genre_id=g.genre_id
WHERE g.genre_title='Sci-Fi';
