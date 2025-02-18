CREATE FUNCTION full_name(first_name CHAR(20), last_name CHAR(30))
RETURNS CHAR(55) DETERMINISTIC
RETURN concat(first_name, ' ', last_name);