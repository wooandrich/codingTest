-- 코드를 입력하세요
SELECT YEAR(sales_date) as YEAR, MONTH(sales_date) as MONTH, GENDER, count(distinct a.user_id) as USER
from online_sale a
join user_info b on a.user_id = b.user_id
where gender is not null
group by year(sales_date), month(sales_date), gender
order by year(sales_date), month(sales_date), gender