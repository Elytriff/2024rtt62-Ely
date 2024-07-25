-- Seing all employees that work in an office in the usa
select * from offices;
select e.*, o.city
from employees e, offices o
where e.office_id = o.id and o.country = 'USA' ;

-- looking what is in the tables
select * from orders;
select * from orderdetails;

select od.*, (quantity_ordered * price_each) as total_price, p.product_name, o.order_date
from orderdetails od, products p, orders o
where order_id = 10103
and p.id = od.product_id
and o.id = od.order_id
order by order_line_number;

 -- sum Total cost of line items for order 10103
 -- sum here is an agregate function
  select sum(quantity_ordered * price_each) as total_price
  from orderdetails od
  where order_id = 10103;
  
  
  select sum(quantity_ordered * price_each) as total_price,
  max(quantity_ordered) as max_quantity_ordered,
  min(quantity_ordered) as min_quantity_ordered,
  avg(quantity_ordered * price_each) as average_line_item_cost,
  avg(quantity_ordered) as avg_quantity_ordered
  from orderdetails od
  where order_id = 10103;
  
  -- Total cost for each order  for all orders
  select * from orderdetails;
  
  select order_id, sum(quantity_ordered * price_each) as total_order_cost,
  min(quantity_ordered) as min_quantity_ordered,
  count(*) as number_of_products
  from orderdetails
  group by order_id;
  
  -- #####Total amount each customer has spent######
  -- step 1
select c.customer_name, o.id as order_id
from customers c, orders o
where c.id = o.customer_id 
order by customer_name;

-- Step 2
select c.customer_name, o.id as order_id, od.product_id
from customers c, orders o, orderdetails od
where c.id = o.customer_id and o.id = od.order_id
order by customer_name, order_id;
  
-- step 3
select c.id, c.customer_name, o.id as order_id, od.product_id, quantity_ordered, price_each, (quantity_ordered * price_each) as line_item_cost
from customers c, orders o, orderdetails od
where c.id = o.customer_id and o.id = od.order_id
order by customer_name, order_id;

-- step 4
-- we removed the extra columns that where not in the group by from the select
-- also removed the extra columns from the order by
-- because we are grouping by the customer id, we can get the customer name because the record is singular and grouped by
select c.id, sum(quantity_ordered * price_each) as total_customer_spend
from customers c, orders o, orderdetails od
where c.id = o.customer_id and o.id = od.order_id
group by c.id
order by total_customer_spend desc;

-- to expand the original question to see the sum of each order per customer
select c.id, sum(quantity_ordered * price_each) as total_order_cost
from customers c, orders o, orderdetails od
where c.id = o.customer_id and o.id = od.order_id
group by c.id, o.id
order by customer_name;

-- Seing orders over 50k
-- aggregate result has not yet
select c.id, customer_name, o.id as order_id, sum(quantity_ordered * price_each) as total_order_cost
from customers c, orders o, orderdetails od
where c.id = o.customer_id and o.id = od.order_id
group by c.id, o.id
having total_order_cost > 50000 -- This is a filter used only in agregated functions
order by customer_name;

  
 


