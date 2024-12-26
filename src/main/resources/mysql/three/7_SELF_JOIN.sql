-- SELF JOIN -> pravimo spajanje podataka iz iste tabele
-- Naravno ti redovi moraju biti povezani preko različitih
-- kolona: employee_id i reports_to
-- employee_id od manadzera je reports_to od uposlenika
SELECT 
    e.employee_id,
	e.first_name, 
    e.last_name, 
    m.employee_id as 'Šefov ID',
    m.first_name as 'Šefovo IME',
    m.last_name as 'Šefovo PREZIME'
FROM employees e
JOIN employees m
  ON e.reports_to=m.employee_id;