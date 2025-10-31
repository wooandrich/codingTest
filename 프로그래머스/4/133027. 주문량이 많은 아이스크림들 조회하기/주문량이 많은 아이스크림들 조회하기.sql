-- 코드를 입력하세요
SELECT f.FLAVOR
from FIRST_HALF f
join (select FLAVOR, sum(TOTAL_ORDER) AS TOTAL_ORDER
      from JULY
      group by FLAVOR
     ) j
on f.FLAVOR = j.FLAVOR
order by f.TOTAL_ORDER + j.TOTAL_ORDER DESC
limit 3