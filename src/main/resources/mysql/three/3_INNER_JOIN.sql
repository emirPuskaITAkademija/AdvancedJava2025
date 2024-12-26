SELECT order_id, customers.customer_id, first_name, last_name
FROM orders
JOIN customers 
   ON orders.customer_id=customers.customer_id;
-- Mi ovdje(orders) ne čuvamo imena i prezimena