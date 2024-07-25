-- Question 0.1
-- I want to see the count of the number of products in each product line
select prd.product_code, prd.product_name, prl.product_line -- just taking a look
from productlines prl, products prd
where prd.productline_id = prl.id;

-- ANSWER 
select  prl.product_line, count(*) as number_of_products
from productlines prl, products prd
where prd.productline_id = prl.id
group by prl.product_line;

-- -----------------------------------------------------------------------------------
-- question 0.2
-- I want to see a list of employees and all of the customers for that employee.   Employee name will be duplicated in the result set.   I want to see the employee first and last name
-- and the customer contact first and last name as well as the customer name

-- ANSWER
select e.firstname as sales_rep_firstname, e.lastname as sales_rep_lastname, 
c.contact_firstname as customer_contact_firstname, c.contact_lastname as customer_contact_firstname, c.customer_name
from employees e, customers c
where e.id = c.sales_rep_employee_id
order by sales_rep_employee_id;

-- ---------------------------------------------------------------------------------------------
-- question 0.3
-- I want to see a list of employees in each office.  Show the office name and the employee name

-- ANSWER
select o.id as office_id , e.firstname as employee_firstname, e.lastname as employee_lastname
from employees e, offices o
where e.office_id = o.id
order by office_id;

-- --------------------------------------------------------------------------------------------------------------------------
-- question 0.4
-- I want to see the totaly number of each employee type based on job title.. result should be the job title and the number of employess with that job title.
select e.job_title, e.id -- just taking a look
from employees e;

-- ANSWER
select e.job_title, count(e.id) as number_of_employees -- you can do count(*)
from employees e
group by e.job_title;

-- ------------------------------------------------------------------------------------------------------------------
-- question 0.5
-- I want to see a list of all payments each customer has made.  Order the list by custoemr name ascending, then by the payment amount descending

-- Answer
select c.customer_name, p.amount
from customers c, payments p
where p.customer_id = c.id
order by c.customer_name asc, p.amount desc;

-- ----------------------------------------------------------------------------------------------------------------
-- question 0.6
-- I want to see a list of products that have never been sold.   use ... not in ( select product_id from order_details ) in your where clause
select * from products where id not in ( select product_id from orderdetails ); 

-- Answer
select p.*
from products p
where p.id not in (select o.product_id from orderdetails o);

-- -----------------------------------------------------------------------------------------------------------
-- question 0.7
-- are there any customers that have never made an order

-- Answer
select c.*
from customers c
where c.id not in (select o.customer_id from orders o);

-- --------------------------------------------------------------------------------------------------------
-- Question 1
-- How many customer are handled by each office.  I want to see the office name and the count of the number of customers in that office.

select o.id as Office, c.id as Customers -- just taking a look
from customers c, employees e, offices o
where c.sales_rep_employee_id = e.id  and e.office_id in(o.id);

-- Answer
select o.id as Office,  count(c.id) as number_of_customers -- we can say count(*)
from customers c, employees e, offices o
where c.sales_rep_employee_id = e.id  and e.office_id in(o.id)
group by o.id;

-- -----------------------------------------------------------------------------------------------------------------------
-- Question 2
-- I want to see the products with the most margin at the top of the table.  Include the product name, buy price, msrp, and margin in the results.  
-- Margin is calculated (MSPR - buy_price) 

-- Answer
select product_name, buy_price, msrp, (msrp - buy_price) as margin
from products
order by margin desc;

-- --------------------------------------------------------------------------------------------------------------------
-- Question 2.5
-- I want to see the top 5 customers in each state based on margin 

-- in progress ###############
select c.state, c.customer_name, (od.price_each - p.buy_price) as margin
from products p, orderdetails od, orders o, customers c
where c.id = o.customer_id and o.id in(od.order_id) and od.product_id in (p.id) and c.state is not NULL
order by c.state, margin desc;

-- palying around
select c.state, c.customer_name, (od.price_each - p.buy_price) as margin
from products p, orderdetails od, orders o, customers c
where c.id = o.customer_id and o.id in(od.order_id) and od.product_id in (p.id) and c.state is not NULL
order by c.state, margin desc;


-- ------------------------------------------------------------------------------------------------------------------
-- Question 3
--  I want to see the top 5 salesmen in the company based on the total amount sold
Select e.id, e.firstname, e.lastname, (od.quantity_ordered * od.price_each) as total_payed_by_client -- just taking a look
from employees e, customers c, orders o, orderdetails od
where e.id = c.sales_rep_employee_id and c.id in (o.customer_id) and o.id in(od.order_id)
order by e.id desc;

-- Answer
Select e.id, e.firstname, e.lastname, sum(od.quantity_ordered * od.price_each) as total_amount_made
from employees e, customers c, orders o, orderdetails od
where e.id = c.sales_rep_employee_id and c.id in (o.customer_id) and o.id in(od.order_id)
group by e.id
order by total_amount_made desc
limit 5;

-- ---------------------------------------------------------------------------------------------------------------------------
-- Question 4
-- I want to see the top 5 salesmen based on overall profit (margin)

-- Answer
Select e.id, e.firstname, e.lastname, sum(od.price_each - p.buy_price) as profit_on_overall_sales
from employees e, customers c, orders o, orderdetails od, products p
where e.id = c.sales_rep_employee_id and c.id in (o.customer_id) and o.id in(od.order_id) and od.product_id in (p.id)
group by e.id
order by profit_on_overall_sales desc
limit 5;

-- ----------------------------------------------------------------------------------------------------------------------
-- Question 5 
-- I want to see all of the orders that happened in 2004.   You can use a function called year(order_date) = 2004

-- Answer
select year(order_date) as year_2004, id
from orders
where year(order_date) = 2004;

-- 
-- ---------------------------------------------------------------------------------------------------------------------
-- Question 6
-- I want to see the total amount of all orders grouped by the year. Refers to the amount of money

-- Answer--- wrong!!!!!
select year(order_date) as order_year, count(id) as total_amount_orders
from orders
group by year(order_date);


-- ------------------------------------------------------------------------------------------------------------------------------------
-- Question 7
-- I want to see the top 5 products based on quantity sold across all orders

select* from orders; -- just taking a look

-- Answer 1, Not taking into account cancelled orders
Select p.id, p.product_name, sum(od.quantity_ordered) as total_quantity_sold
from orderdetails od, products p
where od.product_id = p.id 
group by p.id
order by total_quantity_sold desc
limit 5;

-- Answer 2, taking into account cancelled orders
select p.id, p.product_name, sum(od.quantity_ordered) as total_quantity_sold
from orderdetails od, products p, orders o
where o.id = od.order_id and p.id in(od.product_id) and o.status != 'Cancelled' 
group by p.id
order by total_quantity_sold desc
limit 5;

-- -------------------------------------------------------------------------------------------------------------------
-- question 7.5
-- how many times has each product appeared in an order reguardless of how many were purchased. 

-- Answer (I think this question ment to be different?)  ??????????????????????????????????
 select od.order_id, od.product_id, p.product_name, od.quantity_ordered
 from products p, orderdetails od
 where p.id = od.product_id; 

select p.id, p.product_name, count(p.id) as count -- unfinished
from orderdetails o, products p
where p.id = o.product_id
group by p.id;


-- --------------------------------------------------------------------------------------------------------
-- question 7.6
-- how many products would be out of stock based on the amount sold acrosss time.  -- not sure if the data will support this .. basically 
-- looking for any product where the sum of the quantity sold is greater than the quantity in stock

-- in progress ###############
select p.id as product_id, p.product_name, p.quantity_in_stock, o.order_date, o.id as order_id -- just taking a look
, od.quantity_ordered
from products p, orderdetails od, orders o
where o.id = od.order_id and p.id = od.product_id and o.status != 'Cancelled'
order by o.id;


-- ----------------------------------------------------------------------------------------------------------
-- question 7.9
-- I want to see the distinct order status ordered alphabetically

-- Answer
 select distinct status
 from orders
 order by status asc;

-- --------------------------------------------------------------------------------------------------------------
-- Question 8
-- I want to see the office name and the distinct product lines that have been sold in that office.  This will require joining almost all of the tables.  
-- select distinct o.name as office_name, pl.productlines as product_line_name  ....

select * -- just taking a look
from productlines;

-- Answer
select distinct ofc.id as office, pl.product_line
from offices ofc, employees e, customers c, orders o, orderdetails od, products p, productlines pl
where ofc.id = e.office_id
and e.id = c.sales_rep_employee_id
and c.id = o.customer_id
and o.id = od.order_id
and p.id = od.product_id
and pl.id = p.productline_id
order by ofc.id asc;







 