-- 코드를 입력하세요
SELECT b.AUTHOR_ID, a.AUTHOR_NAME, b.category, sum(sales * price) as TOTAL_SALES
from book b
join author a on b.AUTHOR_ID = a.AUTHOR_ID
join book_sales s on b.BOOK_ID = s.BOOK_ID
where s.SALES_DATE like "2022-01%"
group by a.AUTHOR_NAME, b.category
order by b.AUTHOR_ID, category desc