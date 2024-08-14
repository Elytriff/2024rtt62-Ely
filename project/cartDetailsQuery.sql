select 
c.name, c.last_name,
o.id as order_id, o.status,
p.product_name, p.location, p.product_type, 
od.booking_date, od.duration_hours, od.number_of_pax, od.quantity_ordered, od.total_price
from orderdetail od, product p, qvainside_capstone.order o, customer c
where od.product_id = p.id 
and o.id = od.order_id
and c.id = o.customer_id
and o.id=1;

