REM   Script: Activity4
REM   4


SELECT * FROM salesman;

select salesman_id, salesman_city FROM salesman;

select * from salesman WHERE salesman_city='Paris';

select salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

