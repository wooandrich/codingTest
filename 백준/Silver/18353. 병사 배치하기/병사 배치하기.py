import sys

n = int(sys.stdin.readline().rstrip())

arr = list(map(int, sys.stdin.readline().rstrip().split()))
arr.reverse()

dp = [1] * n

for i in range(1, n):
    for j in range(i):
        if arr[j] < arr[i]:
            dp[i] = max(dp[i], dp[j] + 1)
print(n - max(dp))
