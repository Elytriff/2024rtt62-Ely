SELECT order_id, SUM(quantity_ordered) as Qty,
    IF(MOD(SUM(quantity_ordered),2),'Odd', 'Even') as oddOrEven
FROM    orderdetails
GROUP BY    order_id
ORDER BY    order_id; 


SELECT TRUNCATE(1.555,1);

SELECT product_id, AVG(quantity_ordered * price_each) as avg_order_value
FROM orderdetails
GROUP BY product_id; 


SELECT     product_id,
  ROUND(AVG(quantity_ordered * price_each)) as avg_order_item_value
FROM     orderdetails
GROUP BY    product_id;  



SELECT   TRUNCATE(1.999,1),  ROUND(1.999,1);


SELECT id, DATEDIFF(required_date, shipped_date) as  daysLeft
FROM     orders
ORDER BY  daysLeft DESC;


SELECT id, DATEDIFF(required_date, order_date) as remaining_days
FROM    orders
WHERE    status = 'In Process'
ORDER BY remaining_days;



SELECT 
    order_id,
    ROUND(DATEDIFF(required_date, order_date) / 7, 2),
    ROUND(DATEDIFF(required_date, order_date) / 30,2)
FROM     orders 
WHERE    status = 'In Process';



SELECT 
    order_id,
    DATE_FORMAT(orderdate, '%Y-%m-%d') order_date,
    DATE_FORMAT(required_date, '%a %D %b %Y') required_date,
    DATE_FORMAT(shipped_date, '%W %D %M %Y') shipped_date
FROM    orders;



SELECT    id,
    DATE_FORMAT(shipped_date, '%W %D %M %Y')  as 'Shipped date'
FROM    orders
ORDER BY shipped_date;


SELECT firstname, LPAD(firstname,10,'kk'), LPAD(firstname,5,'kk'), LPAD(firstname,4,'kk') FROM classic_models.employees;


SELECT YEAR(shipped_date) as year,  COUNT(id) as orderQty
FROM    orders 
GROUP BY YEAR(shipped_date)
ORDER BY YEAR(shipped_date);


SELECT  DAY(order_date) as dayofmonth, COUNT(*)
FROM    orders WHERE    YEAR(order_date) = 2004
GROUP BY dayofmonth
ORDER BY dayofmonth;



