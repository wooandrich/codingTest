import sys

dp = [1,2]

n = int(sys.stdin.readline().rstrip())

if n <= 2:
    print(dp[n-1])
else:
    for i in range(2,n):
        dp.append((dp[i-2] + dp[i-1]) % 15746)
    print(dp[n-1])









