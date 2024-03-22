year, month, day = map(int, input().split())
now_year, now_month, now_day = map(int, input().split())

ans_1 = 0
ans_2 = 1
ans_3 = 0

ans_2 += now_year - year
ans_3 = now_year - year

if now_year > year:
    if now_month > month:
        ans_1 = now_year - year
    elif now_month == month:
        if now_day >= day:
            ans_1 = now_year - year
        else:
            ans_1 = now_year - year - 1
    else:
        ans_1 = now_year - year - 1
else:
    ans_1 = 0

print(ans_1)
print(ans_2)
print(ans_3)