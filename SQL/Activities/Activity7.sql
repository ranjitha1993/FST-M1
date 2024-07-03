REM   Script: Activiy7
REM   7

select * from orders;

select AVG(purchase_amount) AS "Average" from orders;

select MAX(purchase_amount) AS "Maximum" from orders;

select MIN(purchase_amount) AS "Minumum" from orders;

select SUM(purchase_amount) AS "Total sum" from orders;

select COUNT(distinct salesman_id) AS "Total count" from orders;

select * from orders;

select MIN(purchase_amount) AS "Minumum" from orders;

select MAX(purchase_amount) AS "Maximum" from orders;

select AVG(purchase_amount) AS "Average" from orders;

select COUNT(distinct salesman_id) AS "Total count" from orders;

