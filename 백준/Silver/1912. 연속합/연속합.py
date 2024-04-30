import sys

n = int(sys.stdin.readline().rstrip())

arr = list(map(int, sys.stdin.readline().rstrip().split()))

dp = [0] * n

dp[0] = arr[0]

result = 0

for i in range(1,n):
    dp[i] = max(arr[i], dp[i-1] + arr[i])
print(max(dp))
