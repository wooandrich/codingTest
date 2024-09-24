import sys

sys.setrecursionlimit(100000)

input = sys.stdin.readline

def recur(idx, time):
    if time > t:
        return -9999999
    if idx == n:
        return 0
    if dp[idx][time] != -1:
        return dp[idx][time]

    dp[idx][time] = max(recur(idx + 1, time + study[idx][0]) + study[idx][1], recur(idx+1, time))

    return dp[idx][time]

n,t = map(int,input().split())

study = [list(map(int,input().split())) for i in range(n)]

dp = [[-1 for _ in range(t+1)] for _ in range(n)]

ans = recur(0,0)
print(ans)