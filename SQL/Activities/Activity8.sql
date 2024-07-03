REM   Script: Activity8
REM   8


select * from orders;


SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders  
WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

Select SALESMAN_ID,ORDER_DATE,max(PURCHASE_AMOUNT) from orders 
where order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') 
group by SALESMAN_ID,ORDER_DATE;

SELECT customer_id, order_date, MAX(purchase_amount) FROM orders 
GROUP BY customer_id, order_date 
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

