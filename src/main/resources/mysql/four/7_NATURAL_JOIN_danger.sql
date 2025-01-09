-- U MySQL imamo jednostavniji način da povežemo/joinamo
-- dvije tabele, ali nije nešto što preporučujem
-- NATURAL JOIN  - je jedan način spajanja podataka 
-- između dvije tabele koji je lagan za kodirat al OPASAN PO ŽIVOT
-- NE PREPORUČUJEM
USE store;
SELECT 
  o.order_id, 
  c.first_name
FROM orders o
NATURAL JOIN customers c