n = int(input())

dp = [0] * 1001

dp[1] = 1
dp[2] = 2

for i in range(3, n+1):
    dp[i] = min(dp[i-1] + 1, dp[i-3] + 1)

if dp[n] % 2 == 1:
    print("SK")
else:
    print("CY")