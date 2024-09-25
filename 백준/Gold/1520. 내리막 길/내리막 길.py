import sys
sys.setrecursionlimit(1000000000)
input = sys.stdin.readline

def recur(x,y):

    if x == m-1 and y == n-1:
        return 1

    if dp[x][y] != -1:
        return dp[x][y]

    route = 0
    for dx,dy in [[-1,0],[1,0],[0,-1],[0,1]]:
        nx = x+dx
        ny = y+dy
        if 0 <= nx < m and 0 <= ny < n:
            if graph[x][y] > graph[nx][ny]:
                route += recur(nx,ny)
    dp[x][y] = route
    return dp[x][y]


m,n = map(int,input().split())

graph = [list(map(int,input().split())) for _ in range(m)]

dp = [[-1 for _ in range(n)] for _ in range(m)]

ans = recur(0,0)
print(ans)
