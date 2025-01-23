-- Vježba
-- Izvuci najnoviju komediju

-- sa i bez max 
-- SA max funkcijom - 'Comedy' 
 SELECT 
   *
 FROM film_category fc 
 JOIN film f ON fc.film_id=f.film_id
 JOIN category c ON fc.category_id=c.category_id
 WHERE c.name='Comedy';
 
 
 SELECT 
    max(f.release_year)
 FROM film f 
 JOIN film_category fc ON f.film_id=fc.film_id
 JOIN category c ON c.category_id=fc.category_id
 WHERE c.name='Comedy'
ORDER BY f.release_year DESC ;
 
 
 
 -- Bez MAX funkcije
 SELECT 
   f.film_id, f.title, f.release_year, c.name
 FROM film f 
 JOIN film_category fc ON f.film_id=fc.film_id
 JOIN category c ON c.category_id=fc.category_id
 WHERE c.name='Comedy'
 ORDER BY f.release_year DESC 
 LIMIT 1;
 
 
 -- Sa max
  SELECT 
   f.film_id, f.title, f.release_year, c.name
  FROM film f 
  JOIN film_category fc ON f.film_id=fc.film_id
  JOIN category c ON fc.category_id=c.category_id
  WHERE c.name='Comedy'
  AND f.release_year=(
	SELECT max(f2.release_year)
    FROM film f2
    JOIN film_category fc2 ON fc2.film_id = f2.film_id
    JOIN category c2 ON fc2.category_id = c2.category_id
    WHERE c2.name='Comedy'
  );