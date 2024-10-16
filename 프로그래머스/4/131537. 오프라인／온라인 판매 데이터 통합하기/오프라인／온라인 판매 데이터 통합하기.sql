-- 코드를 입력하세요
SELECT date_format(SALES_DATE,'%Y-%m-%d') as sales_date, PRODUCT_ID, USER_ID, SALES_AMOUNT
from ONLINE_SALE
where year(sales_date) = '2022' and month(sales_date) = '3'
union 
select date_format(SALES_DATE,'%Y-%m-%d') as sales_date, PRODUCT_ID, NULL as USER_ID, SALES_AMOUNT
from OFFLINE_SALE
where year(sales_date) = '2022' and month(sales_date) = '3'
order by sales_date, product_id, user_id

