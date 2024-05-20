import sys

input = sys.stdin.readline

n = int(input())


arr = list(map(int, input().split()))
ans = []

dp = [1] * n

for i in range(n):
    for j in range(i):
        if arr[i] > arr[j]:
            dp[i] = max(dp[i], dp[j]+1)

find = max(dp)

for i in range(len(arr)-1,-1,-1):
    if dp[i] == find:
        ans.append(arr[i])
        find -= 1
print(len(ans))
print(*ans[::-1])












