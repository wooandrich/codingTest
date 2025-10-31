-- 코드를 입력하세요
SELECT sub.AUTHOR_ID, a.AUTHOR_NAME, sub.CATEGORY, sum(sub.TOTAL_SALES) as TOTAL_SALES
from (select b.AUTHOR_ID, b.CATEGORY, (b.PRICE * s.SALES) as TOTAL_SALES
      from book b
      join BOOK_SALES s on b.BOOK_ID = s.BOOK_ID
      where s.SALES_DATE between '2022-01-01' and '2022-01-31'
) sub
join AUTHOR a on sub.AUTHOR_ID = a.AUTHOR_ID
group by AUTHOR_NAME, CATEGORY
order by sub.AUTHOR_ID asc, sub.CATEGORY desc
