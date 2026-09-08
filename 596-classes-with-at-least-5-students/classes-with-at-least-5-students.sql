# Write your MySQL query statement below
select distinct r.class 
from courses as r
where (select count(c.student) from courses as c where r.class=c.class group by c.class)>=5