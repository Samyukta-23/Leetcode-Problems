select r.query_name , round(sum(r.rating/r.position)/count(r.position),2) as quality
,       coalesce(round((select count(q.rating) 
        from queries as q
        where q.rating<3 and r.query_name= q.query_name
        group by q.query_name)
        /count(r.position)*100,2),0) as poor_query_percentage
from queries as r
group by r.query_name