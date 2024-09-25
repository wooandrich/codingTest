import sys
sys.setrecursionlimit(1000000000)
input = sys.stdin.readline

def recur(x,y):

    if dp[x][y] != -1:
        return dp[x][y]

    route = 0
    for dx,dy in [[-1,0],[1,0],[0,-1],[0,1]]:
        nx = x+dx
        ny = y+dy
        if 0<=nx<n and 0<=ny<n:
            if graph[x][y] < graph[nx][ny]:
                route = max(route, recur(nx,ny) + 1)
    dp[x][y] = route
    return dp[x][y]


n = int(input())

graph = [list(map(int, input().split())) for _ in range(n)]

dp = [[-1 for _ in range(n)] for _ in range(n)]

for x in range(n):
    for y in range(n):
        recur(x,y)
print(max(map(max, dp)) + 1)