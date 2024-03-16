a = int(input())

ans = 0

if a % 4 == 0 and a % 100 != 0:
    ans = 1
if a % 400 == 0:
    ans = 1
print(ans)