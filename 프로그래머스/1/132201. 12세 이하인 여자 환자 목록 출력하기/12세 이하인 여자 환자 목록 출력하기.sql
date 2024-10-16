-- 코드를 입력하세요
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO, 'NONE') as tlno
from PATIENT
where gend_cd = 'W' and age <= 12
order by age desc, pt_name