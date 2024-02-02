-- 코드를 입력하세요
SELECT car_id, max(case when '2022-10-16' between START_DATE AND END_DATE THEN '대여중' ELSE '대여 가능' end) as AVAILABILITY
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by car_id
order by car_id desc