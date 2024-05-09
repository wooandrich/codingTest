import sys

n = int(sys.stdin.readline().rstrip())
arr = [list(map(int, sys.stdin.readline().rstrip().split())) for _ in range(n)]

dp = [[0 for _ in range(n)] for _ in range(n)]

for term in range(1, n):
    for start in range(n):
        end = start + term

        if end >= n:
            break

        result = int(1e9)

        for cut in range(start, end):
            result = min(result, dp[start][cut] + dp[cut + 1][end] + arr[start][0] * arr[cut][1] * arr[end][1])
        dp[start][end] = result
print(dp[0][-1])
