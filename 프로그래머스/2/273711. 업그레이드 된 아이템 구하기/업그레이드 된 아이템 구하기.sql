-- 코드를 작성해주세요
select a.ITEM_ID, a.ITEM_NAME, a.RARITY
from ITEM_INFO a
join ITEM_TREE b on a.ITEM_ID = b.ITEM_ID
where b.parent_item_id in (
    select item_id
    from ITEM_INFO
    where rarity = 'rare'
)
order by item_id desc