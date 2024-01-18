-- 코드를 입력하세요
SELECT a.title, a.BOARD_ID, b.REPLY_ID, b.WRITER_ID, b.CONTENTS, date_format(b.CREATED_DATE, '%Y-%m-%d')
from USED_GOODS_BOARD a
join USED_GOODS_REPLY b on a.BOARD_ID = b.BOARD_ID
where YEAR(a.CREATED_DATE) = 2022 and MONTH(a.CREATED_DATE) = 10
order by b.CREATED_DATE, a.TITLE
