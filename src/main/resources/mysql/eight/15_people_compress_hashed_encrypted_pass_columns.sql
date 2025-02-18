-- Encryption, Hashing i Compression
-- enkripcija ->
-- 'Nebo je plavo' + ENC ALG = 'AKMSKMAKSMKAMSKAM'
-- 'AKMSKMAKSMKAMSKAM' + ENC ALG = 'Nebo je plavo'
-- hashing ->
-- 'Lozinka123!*' + HASH ALG = 'sdmksmdksmdksmdksmd'
-- 'sdmksmdksmdksmdksmd' + HASH ALG = ideja je da 
-- compression -> 2mb -> 1 mb

-- Postoje funkcije
-- SHA2 - funkcija za HASHIRANJE
-- AES - Advanced Encryption System
-- AES_ENCRYPT
-- AES_DECRYPT
-- COMPRESS
-- UNCOMPRESS

DROP TABLE IF EXISTS movies.people;
CREATE TABLE people(
	person_id INT(10) NOT NULL, 
    first_name VARCHAR(50) NOT NULL, 
    last_name VARCHAR(50) NOT NULL, 
    account_type tinyint(1) NOT NULL DEFAULT 1,
    dob year(4) NOT NULL DEFAULT '2025',
    compress_pass varbinary(50) NOT null,
    hash_pass varchar(128) NOT NULL, 
    enc_pass varbinary(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO people
(person_id, first_name, last_name, account_type, dob, compress_pass, hash_pass, enc_pass)
VALUES
 (1, 'John', 'Doe', 1, 2000, '', '', '');

