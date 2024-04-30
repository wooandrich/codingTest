import sys

n = int(sys.stdin.readline().rstrip())
arr = [[0] * 2] * n
dp = [1] * n


for i in range(n):
    arr[i] = list(map(int,sys.stdin.readline().rstrip().split()))

arr.sort()

for i in range(n):
    for j in range(i):
        if arr[i][1] > arr[j][1]:
            dp[i] = max(dp[i], dp[j] + 1)
print(n - max(dp))