import sys
from collections import deque

row,col = map(int,sys.stdin.readline().rstrip().split())

arr = [list(map(int,sys.stdin.readline().rstrip()))for _ in range(row)]
visited = [[[False]*2 for _ in range(col)]for _ in range(row)]


dx = [-1,1,0,0]
dy = [0,0,-1,1]

ans = 0
q = deque()
q.append((0,0,0,1))
visited[0][0][0] = True
while q:
    x,y,cnt,chance = q.popleft()
    if x == row-1 and y == col -1:
        ans = cnt
        break
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0<=nx<row and 0<=ny<col:
            if chance == 1 and arr[nx][ny] == 1 and not visited[nx][ny][1]:
                visited[nx][ny][1] = True
                q.append((nx,ny,cnt+1,0))
            elif chance == 0 and not visited[nx][ny][1] and not arr[nx][ny]:
                visited[nx][ny][1] = True
                q.append((nx, ny, cnt + 1, 0))
            elif chance == 1 and not arr[nx][ny] and not visited[nx][ny][0]:
                visited[nx][ny][0] = True
                q.append((nx,ny,cnt+1,1))
if visited[row-1][col-1][0] or visited[row-1][col-1][1]:
    print(ans+1)
else:
    print(-1)


