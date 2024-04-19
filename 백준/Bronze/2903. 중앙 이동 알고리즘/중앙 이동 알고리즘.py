n = int(input())



ans = 0
cnt = 2

for i in range(n+1):
    ans = cnt * cnt
    cnt = cnt + 2**i
print(ans)