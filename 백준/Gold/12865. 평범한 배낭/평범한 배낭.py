import sys

sys.setrecursionlimit(100000)

input = sys.stdin.readline

def recur(idx, weight):
    if weight > k:
        return -9999999
    if idx == n:
        return 0
    if dp[idx][weight] != -1:
        return dp[idx][weight]

    dp[idx][weight] = max(recur(idx + 1, weight + bag[idx][0]) + bag[idx][1], recur(idx + 1, weight))

    return dp[idx][weight]


n,k = map(int,input().split())

bag = [list(map(int, input().split())) for _ in range(n)]

dp = [[-1 for _ in range(100001)] for _ in range(n)]

ans = recur(0,0)

print(ans)
