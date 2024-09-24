import sys

sys.setrecursionlimit(100000)

input = sys.stdin.readline

def recur(idx, blood):
    if blood <= 0:
        return -999999
    if idx == n:
        return 0
    if dp[idx][blood] != -1:
        return dp[idx][blood]
    dp[idx][blood] = max(recur(idx+1, blood - hp[idx]) + happy[idx], recur(idx+1, blood))

    return dp[idx][blood]

n = int(input())

hp = list(map(int, input().split()))
happy = list(map(int, input().split()))

dp = [[-1 for _ in range(101)] for _ in range(n)]

ans = recur(0,100)
print(ans)