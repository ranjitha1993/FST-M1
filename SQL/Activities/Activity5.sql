REM   Script: Activity5
REM   4


--UPDATE salesman SET grade=100;

select * from salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

select * from salesman;

