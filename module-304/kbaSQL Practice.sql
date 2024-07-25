-- Use the fornat function

select p.product_name, max(p.buy_price), min(p.buy_price), format(round(avg(p.quantity_in_stock)), 2), count(*) as product_count
from products p, orderdetails od
where p.id = od.product_id
group by od.product_id;



select l.name, 
min(o.amount) as min_offer, 
avg(o.amount) as avg_offer, -- probar diferentes formas de format()
max(o.amount) as max_offer, 
count(o.lot_id) as offers
from lots l, offers o 
where l.id = o.lot_id
group by o.lot_id
order by offers;

