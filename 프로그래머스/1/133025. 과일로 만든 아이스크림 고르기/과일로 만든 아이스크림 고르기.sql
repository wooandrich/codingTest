-- 코드를 입력하세요
SELECT a.flavor
from FIRST_HALF a
join ICECREAM_INFO b on a.flavor = b.flavor
where total_order > 3000 and b.INGREDIENT_TYPE = 'fruit_based'
order by total_order desc
