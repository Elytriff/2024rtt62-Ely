SELECT
od.quantity_ordered * od.duration_hours * od.number_of_pax * p.price_per_pax_per_hour as total_price,
 o.status, o.create_date,
od.product_id, od.order_id, od.booking_date, od.duration_hours, od.number_of_pax, od.quantity_ordered
FROM qvainside_capstone.order o, orderdetail od, product p
WHERE o.id = od.order_id AND p.id = od.product_id
AND o.id = 20
AND o.customer_id = 8;