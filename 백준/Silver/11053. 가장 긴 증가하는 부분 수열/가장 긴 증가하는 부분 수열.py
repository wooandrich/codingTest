import sys

n = int(sys.stdin.readline().rstrip())

arr = [0] + list(map(int,sys.stdin.readline().rstrip().split()))

dp = [1] * (n+1)

for i in range(1,n+1):
    for j in range(1,i+1):
        if arr[i] > arr[j]:
            dp[i] = max(dp[i], dp[j] + 1)
print(max(dp))


