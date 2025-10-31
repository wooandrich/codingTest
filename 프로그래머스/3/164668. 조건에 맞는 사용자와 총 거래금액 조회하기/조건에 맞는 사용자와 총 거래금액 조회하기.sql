-- 코드를 입력하세요
SELECT sub.USER_ID, sub.NICKNAME, sum(sub.PRICE) as TOTAL_SALES
from (select USER_ID, NICKNAME, PRICE
      from USED_GOODS_BOARD b
      join USED_GOODS_USER u on b.WRITER_ID = u.USER_ID
      where STATUS = 'DONE'
) sub
group by USER_ID
having sum(sub.PRICE) >= 700000
order by TOTAL_SALES ASC
