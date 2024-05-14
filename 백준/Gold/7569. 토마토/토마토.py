import sys
from collections import deque

col, row, height = map(int, sys.stdin.readline().rstrip().split())
q = deque()

box = [[list(map(int,sys.stdin.readline().rstrip().split())) for _ in range(row)] for _ in range(height)]
visited = [[[False for _ in range(col)] for _ in range(row)]for _ in range(height)]

dx = [-1, 1, 0, 0,0,0]
dy = [0, 0, -1, 1,0,0]
dz = [0,0,0,0,1,-1]


for i in range(height):
    for j in range(row):
        for k in range(col):
            if box[i][j][k] == 1 and not visited[i][j][k]:
                q.append((i, j,k, 0))
ans = 0

while q:
    z, x, y, cnt = q.popleft()
    ans = cnt
    visited[z][x][y] = True
    for i in range(6):
        nx = x + dx[i]
        ny = y + dy[i]
        nz = z + dz[i]
        if 0 <= nx < row and 0 <= ny < col and 0<= nz < height and not visited[nz][nx][ny] and not box[nz][nx][ny]:
            visited[nz][nx][ny] = True
            box[nz][nx][ny] = 1
            q.append((nz,nx,ny,cnt+1))
sign = True
for k in range(height):
    if not sign:
        break
    for i in range(row):
        for j in range(col):
            if box[k][i][j] == 0:
                sign = False

if sign:
    print(ans)
else:
    print(-1)