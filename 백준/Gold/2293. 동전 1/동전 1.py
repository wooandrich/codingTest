import sys

n,k = map(int,sys.stdin.readline().rstrip().split())

arr = []
dp = [0] * (k+1)
dp[0] = 1
for _ in range(n):
    arr.append(int(sys.stdin.readline().rstrip()))

arr.sort()

for coin in arr:
    for i in range(coin,k+1):
        dp[i] += dp[i-coin]
print(dp[k])