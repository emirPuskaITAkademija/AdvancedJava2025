-- IF  and NULL IF
-- control flow   logika ? vrijednost_true: vrijednost_false
-- IF(logika, VRIJEDNOST_AKO_JE_LOGIKA_TRUE, VRIJEDNOST_AKO_JE_LOGIKA_FALSE)
-- Logika je bazirana na već postojećim podacima u nekoj koloni
-- Npr. uzet ćemo movie_title -> ako movie_title podatak ima 'THE'
USE movies;
SELECT 
  m.movie_id, 
  m.movie_title, 
  if(m.movie_title LIKE '%the%', 'THE MOVIE', 'NEMA the u naslovu') AS message
FROM movies m;