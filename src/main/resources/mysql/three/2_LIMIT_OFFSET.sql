-- LIMIT
-- INPUT: page=1 & pageSize=3
-- page=0: 1-3
-- page=1: 4-6 Da bi učitali redove 4, 5, 6 prva 3 moramo preskočiti
-- INPUT: page=2 & pageSize=3
-- page=2: 7-9 Da bi učitali redove 7, 8, 9 moramo prvih 6 preskočiti
SELECT * 
FROM customers
LIMIT 6,3; -- pageSize=3 PRVI PARAM: offset(page*pageSize) DRUGI: pageSize
