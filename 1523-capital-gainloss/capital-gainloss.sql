-- Write your PostgreSQL query statement below
select stock_name, (sum(case when operation like 'Sell' then price else 0 end)-sum(case when operation like 'Buy' then price else 0 end)) as capital_gain_loss
from stocks
group by stock_name;