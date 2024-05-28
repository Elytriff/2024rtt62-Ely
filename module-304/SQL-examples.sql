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
 


