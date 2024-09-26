import sys
sys.setrecursionlimit(1000000000)
input = sys.stdin.readline

n = int(input())

arr = [list(map(int, input().split())) for _ in range(n)]

dp = [1 for _ in range(n)]

arr.sort()

for i in range(n):
    for j in range(i):
        if arr[i][1] > arr[j][1]:
            dp[i] = max(dp[i], dp[j] + 1)
print(n - max(dp))