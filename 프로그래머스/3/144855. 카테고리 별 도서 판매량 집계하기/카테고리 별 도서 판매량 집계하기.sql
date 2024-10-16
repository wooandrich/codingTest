-- 코드를 입력하세요
SELECT category, sum(sales) as toatl_sales
from book a
join book_sales b on a.book_id = b.book_id
where b.sales_date like '2022-01%'
group by category
order by category