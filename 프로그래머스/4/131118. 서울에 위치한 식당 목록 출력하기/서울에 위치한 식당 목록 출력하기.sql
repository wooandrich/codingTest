-- 코드를 입력하세요
SELECT i.rest_id, i.rest_name, i.food_type, i.favorites, i.ADDRESS, round(avg(REVIEW_SCORE),2) as SCORE
from rest_info i
join rest_review r on i.REST_ID = r.REST_ID
where i.address like '서울%'
group by r.rest_id
order by SCORE desc, i.favorites desc