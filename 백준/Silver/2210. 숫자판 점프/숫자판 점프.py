import sys

dx = [0,0,1,-1]
dy = [1,-1,0,0]

input = sys.stdin.readline

def dfs(x,y,count, temp):
    if count == 6:
        ans.add(int(temp))
        return
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0<=nx<5 and 0<=ny<5:
            dfs(nx,ny,count+1, temp+str(arr[nx][ny]))

arr = [list(map(int,input().split())) for _ in range(5)]

ans = set()

for i in range(5):
    for j in range(5):
        dfs(i,j,1,str(arr[i][j]))
print(len(ans))
