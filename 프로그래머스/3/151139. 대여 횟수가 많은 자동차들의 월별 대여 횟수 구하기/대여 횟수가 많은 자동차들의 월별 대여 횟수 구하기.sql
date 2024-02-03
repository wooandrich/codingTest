-- 코드를 입력하세요
SELECT MONTH(START_DATE) as MONTH, CAR_ID, count(*) as RECORDS
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where MONTH(START_DATE) BETWEEN 8 AND 10 and YEAR(START_DATE) = 2022 and car_id IN(
    select car_id
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where date_format(start_date,'%Y-%m') between '2022-08' and '2022-10'
    group by car_id
    having count(car_id) >=5
)
group by CAR_ID,month
having RECORDS > 0
order by month(START_DATE),CAR_ID desc