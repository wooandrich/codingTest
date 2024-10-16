-- 코드를 입력하세요
SELECT BOOK_ID, date_format(published_date, '%Y-%m-%d') as published_date
from BOOK
where year(published_date) = '2021' and category = '인문'
order by published_date