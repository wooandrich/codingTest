-- 코드를 입력하세요
SELECT a.rest_id, rest_name, food_type, favorites, address, round(avg(b.review_score),2) as score
from REST_INFO a
join REST_REVIEW b on a.rest_id = b.rest_id
where address like '서울%'
group by b.rest_id
order by score desc, favorites desc
