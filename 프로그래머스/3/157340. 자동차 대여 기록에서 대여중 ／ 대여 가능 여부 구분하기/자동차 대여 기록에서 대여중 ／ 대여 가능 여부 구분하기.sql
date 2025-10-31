-- 코드를 입력하세요
SELECT car_id, 
    CASE
        When car_id in (select car_id
                        from CAR_RENTAL_COMPANY_RENTAL_HISTORY
                        where START_DATE <= '2022-10-16' and END_DATE >= '2022-10-16') then '대여중'
        else '대여 가능'
    END "AVAILABILITY"
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by car_id
order by car_id desc