import sys

n,m = map(int,sys.stdin.readline().rstrip().split())

A = [0] + list(map(int,sys.stdin.readline().rstrip().split()))
C = [0] + list(map(int,sys.stdin.readline().rstrip().split()))

dp = [[0 for _ in range(sum(C) + 1)] for _ in range(n+1)]

result = int(1e9)

for i in range(1,n+1):
    byte = A[i]
    cost = C[i]

    for j in range(1, sum(C) + 1):
        dp[i][j] = dp[i-1][j]

    for j in range(cost, sum(C)+1):
        dp[i][j] = max(byte + dp[i-1][j-cost], dp[i][j])

        if dp[i][j] >= m:
            result = min(result, j)
if m != 0:
    print(result)
else:
    print(0)
    