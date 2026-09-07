select p.product_id, coalesce(round(sum(u.units*p.price)/(sum(u.units)),2),0) as average_price
from Prices as p left join unitssold as u on p.product_id=u.product_id 
and u.purchase_date>=p.start_date and u.purchase_date<=p.end_date 
group by p.product_id;