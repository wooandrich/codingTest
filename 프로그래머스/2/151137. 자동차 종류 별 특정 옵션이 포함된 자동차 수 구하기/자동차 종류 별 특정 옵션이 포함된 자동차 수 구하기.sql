-- 코드를 입력하세요
SELECT CAR_TYPE, count(CAR_ID) as CARS
from CAR_RENTAL_COMPANY_CAR
where OPTIONS like "%가죽시트%" or OPTIONS like "%통풍시트%" or OPTIONS like "%열선시트%"
group by CAR_TYPE
order by CAR_TYPE