# Write your MySQL query statement below
select max(num) as num
from mynumbers as m1
where (select count(m2.num) from mynumbers  as m2 where m2.num=m1.num group by m2.num)=1
order by num desc limit 1;