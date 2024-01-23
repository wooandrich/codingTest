-- 코드를 입력하세요
SELECT count(USER_ID) as USERS
from USER_INFO
where YEAR(JOINED) = 2021 and AGE >= 20 and AGE <= 29