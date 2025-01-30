-- Zašto VIEW postoji ???
-- 1. Nekada je važno sebi olakšati i ne kreirati svaki dan složene JOIN queries
-- 2. Nekad ne želimo dati pristup tabeli nekom externom korisniku
--    Želimo mu dati ograničen pristup
USE movies;
SELECT *
FROM scifi;