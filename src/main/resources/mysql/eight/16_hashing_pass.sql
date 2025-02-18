UPDATE people SET hash_pass=SHA2('Lozinka123!', 512)
WHERE person_id=1;