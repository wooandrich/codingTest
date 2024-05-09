import sys
sys.setrecursionlimit(10**9)

m,n = map(int,sys.stdin.readline().rstrip().split())

arr = [list(map(int,sys.stdin.readline().rstrip().split())) for _ in range(m)]
dp = [[-1 for _ in range(n)] for _ in range(m)]
dx = [1,-1,0,0]
dy = [0,0,-1,1]





def dfs(row,col):
    global ans
    if row == m-1 and col == n-1:
        return 1

    if dp[row][col] == -1:
        dp[row][col] = 0

        for i in range(4):
            nx = row + dx[i]
            ny = col + dy[i]
            if 0<=nx<m and 0<=ny<n:
                if arr[nx][ny] < arr[row][col]:
                    dp[row][col] += dfs(nx,ny)
    return dp[row][col]
print(dfs(0,0))