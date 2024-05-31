
select c.customer_name as 'Customer Name', concat(e.lastname, ', ', e.firstname) as 'Sales Rep'
from customers c JOIN employees e 
on c.sales_rep_employee_id = e.id
order by c.customer_name asc;

select p.product_name as 'Product Name', sum(od.quantity_ordered) as 'Total # Ordered', sum(od.quantity_ordered * od.price_each) as 'Total Sale'
from products p LEFT JOIN orderdetails od 
on p.product_id = od.product_code
group by p.product_name, p.buy_price
order by 3 desc;


select status as 'Order Status', count(status) as 'Total Orders'
from orders
group by status
order by status;



select 
     pl.product_line as 'Product Line', 
     count(od.product_id) as 'total Sold'
from productlines pl join products p 
on pl.product_line = p.productline -- this is wrong
 JOIN orderdetails od on p.product_code = od.product_id
group by pl.product_line
order by 2 desc;


SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));



select 
   monthname(payment_date) AS Month, 
   year(payment_date) AS Year,
   format(sum(amount), 2) AS 'Payments Received'
from payments
group by year(payment_date), monthname(payment_date) 
order by payment_date;



SELECT p.product_name Name, p.productline_id AS `Product Line`, p.productScale AS `Scale`, p.product-vendor AS `Vendor` FROM productlines l NATURAL JOIN products p 
WHERE l.product_line = "Classic Cars" OR l.product_line = "Vintage Cars"
ORDER BY p.productline DESC, p.product_name ASC;









