-- 코드를 입력하세요
SELECT f.FLAVOR
from FIRST_HALF f
join ICECREAM_INFO i on f.FLAVOR = i.FLAVOR
where TOTAL_ORDER > 3000 and INGREDIENT_TYPE = 'fruit_based'
order by TOTAL_ORDER desc