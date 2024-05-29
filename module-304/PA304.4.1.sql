-- Write SQL queries to accomplish the following tasks:
-- 1 Display the name, product line, and buy price of all products. 
-- The output columns should display as: “Name,” “Product Line,” and “Buy Price.” The output should display the most expensive items first. 
Select p.product_name as Name, pl.product_line as Product_Line, p.buy_price
from products p, productlines pl
where pl.id = p.productline_id
order by p.buy_price desc;


-- 2 Display the first name, last name, and city name of all customers from Germany. 
-- The output columns should display as: “First Name,” “Last Name,” and “City.” The output should be sorted by “Last Name” (ascending).
Select contact_firstname as Name, contact_lastname as Last_name, city
from customers
where country = 'Germany'
order by contact_lastname asc;


-- 3 Display each of the unique values of the status field in the orders table. The output should be sorted alphabetically, ascending.
-- Hint: The output should show exactly six rows.
select distinct status
from orders
order by status asc;


-- 4 Display all fields from the payments table for payments made on or after January 1, 2005. 
-- The output should be sorted by the payment date from highest to lowest.
select *
from payments 
where payment_date >= '2005-01-01'
order by payment_date desc;


-- 5 Display the last Name, first Name, email address, and job title of all employees working out of the San Francisco office. 
-- The output should be sorted by “Last Name.”
select e.lastname, e.firstname, e.email, e.job_title, o.city
from employees e, offices o
where o.id = e.office_id and city != 'San Francisco'
order by e.lastname;


-- 6 Display the name, product line, scale, and vendor of all of the car products – both classic and vintage. 
-- The output should display all vintage cars first (sorted alphabetically by name), and all classic cars last (also sorted alphabetically by name). 
Select p.product_name as Name, pl.product_line as Product_Line, p.product_scale, p.product_vendor
from products p
join productlines pl on pl.id = p.productline_id
where pl.product_line in ('Vintage Cars', 'Classic Cars')
order by pl.product_line desc, substring_index(substring_index(p.product_name, ' ', 2), ' ', -1);

Select p.product_name as Name, pl.product_line as Product_Line, p.product_scale, p.product_vendor
from products p
join productlines pl on pl.id = p.productline_id
where pl.product_line in ('Vintage Cars', 'Classic Cars')
order by pl.product_line desc, SUBSTRING(p.product_name, REGEXP_INSTR(p.product_name, '[^0-9]'));
