-- SELF JOIN 
-- SELF OUTER JOIN -> SELF LEFT JOIN
USE hr;
SELECT 
  e.employee_id , 
  e.first_name AS 'Employee-NAME', 
  m.employee_id AS 'Manager ID', 
  m.first_name AS 'Manager-NAME'
FROM employees e 
LEFT JOIN employees m 
  ON e.reports_to=m.employee_id;