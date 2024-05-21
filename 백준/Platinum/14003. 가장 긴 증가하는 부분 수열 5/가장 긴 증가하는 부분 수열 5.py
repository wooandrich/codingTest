import sys
import bisect

input = sys.stdin.readline


n = int(input())
arr = list(map(int,input().split()))

dp = [arr[0]]

ans = [1] * n

for i in range(n):
    if arr[i] > dp[-1]:
        dp.append((arr[i]))
        ans[i] = len(dp)
    else:
        idx = bisect.bisect_left(dp, arr[i])
        dp[idx] = arr[i]
        ans[i] = idx + 1
find = max(ans)
print(find)
result = []
for i in range(n-1,-1,-1):
    if find == ans[i]:
        result.append(arr[i])
        find -= 1
print(*result[::-1])



























