-- Use the fornat function

select p.product_name, max(p.buy_price), min(p.buy_price), format(round(avg(p.quantity_in_stock)), 2), count(*) as product_count
from products p, orderdetails od
where p.id = od.product_id
group by od.product_id;