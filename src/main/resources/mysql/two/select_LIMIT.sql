-- LIMIT vrlo često kombinuje sa OFFSET
SELECT *
FROM customers
LIMIT 9,3;
-- page 1: 1-3   0,3 offset je 0 formula: OFFSET (page_index-1)*3
-- page 2: 3-6 => 3,3 napravi offset/pomjera za 3 i daj mi sljedeća 3
-- page 3: 6,3 => 6,3
-- page 4: 9,3 