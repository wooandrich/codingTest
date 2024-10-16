-- 코드를 작성해주세요
select ID, EMAIL, FIRST_NAME, LAST_NAME
from DEVELOPERS
where skill_code & (
    select code
    from skillcodes
    where name = 'Python'
) or skill_code & (
    select code
    from skillcodes
    where name = 'C#'
)
order by id
