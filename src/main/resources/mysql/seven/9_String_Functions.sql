-- String functions
USE movies;
SELECT 
	upper(movie_title),
    length(movie_title),
    lower(director), 
    concat_ws(' <-> ',movie_id, movie_title, director),
    trim(director), 
    format(year, 3, 'en_CA') -- fr_CA  en_CA
FROM movies 
LIMIT 10;


-- Formatiranje generalno datuma nije isto 
-- npr. u USA i DE ..
-- Internacionalizacija i Lokalizacija
-- EN us gb 
-- SL 
-- DE de sw aus

-- 12.09.1988
-- 12 Sep 