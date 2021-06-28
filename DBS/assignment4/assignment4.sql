/*1. Display the minimum Status in the Supplier table./
select min(status) from s;*/

/*2. Display the maximum Weight in the Parts table./
select max(weight) from p;*/

/*3. Display the average Weight of the Parts./
select avg(weight) from p;*/

/*4. Display the total Quantity sold for part ‘P1’./
select sum(Qty) from spj where p = 'p1';*/

/*5. Display the total Quantity sold for each part./
select p,sum(qty) 
from spj 
group by p;*/

/*6. Display the average Quantity sold for each part./
select p,avg(qty) 
from spj 
group by p;*/

/*7. Display the maximum Quantity sold for each part, provided the maximum Quantity is greater than 800./
select p,max(qty) 
from spj where qty>'800' 
group by p;*/

/*8. Display the Status and the count of Suppliers with that Status./
select status, count(status)
from s
group by status; */

/*9. Display the count of Projects going on in different cities./
select city, count(city)
from j
group by city;*/

/*10. What is the difference between COUNT(Status) and COUNT() ?*/

/*11. Display the Status and the Count of Suppliers with that Status in the following format as shown below:-
Status      Count
Ten         1
Twenty      2
Thirty      3      */