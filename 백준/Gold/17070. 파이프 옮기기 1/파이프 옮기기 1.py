import sys

input = sys.stdin.readline

n = int(input())

arr = [list(map(int, input().split())) for _ in range(n)]
dp = [[[0] * 3 for _ in range(n)] for _ in range(n)]

for i in range(1,n):
    if arr[0][i] == 1:
        break
    dp[0][i][0] = 1

for i in range(1,n):
    for j in range(1,n):
        if not arr[i][j]:
            dp[i][j][0] = dp[i][j-1][0] + dp[i][j-1][2]
            dp[i][j][1] = dp[i-1][j][1] + dp[i-1][j][2]
        if not (arr[i][j] + arr[i-1][j] + arr[i][j-1]):
            dp[i][j][2] = dp[i-1][j-1][0] + dp[i-1][j-1][1] + dp[i-1][j-1][2]

print(sum(dp[n-1][n-1]))
