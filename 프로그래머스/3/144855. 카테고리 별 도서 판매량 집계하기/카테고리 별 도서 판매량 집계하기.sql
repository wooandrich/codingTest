-- 코드를 입력하세요
SELECT CATEGORY, sum(sales) as TOTAL_SALES
from book b
join book_sales s on b.BOOK_ID = s.BOOK_ID
where SALES_DATE like "2022-01%"
group by category
order by category