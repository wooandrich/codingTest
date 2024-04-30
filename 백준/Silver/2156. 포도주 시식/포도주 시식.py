import sys

arr = [0] * 10001

n = int(sys.stdin.readline().rstrip())

dp = [0] * 10001

for i in range(1,n+1):
    arr[i] = int(sys.stdin.readline().rstrip())

dp[1] = arr[1]
dp[2] = arr[1] + arr[2]
dp[3] = max(arr[1] + arr[3], arr[2]+arr[3], dp[2])

for i in range(4,n+1):
    dp[i] = max(arr[i] + dp[i-2], arr[i] + arr[i-1] + dp[i-3], dp[i-1])
print(max(dp))