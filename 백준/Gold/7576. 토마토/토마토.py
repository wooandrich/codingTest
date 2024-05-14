import sys
from collections import deque

col, row = map(int, sys.stdin.readline().rstrip().split())
q = deque()

box = [list(map(int, sys.stdin.readline().rstrip().split())) for _ in range(row)]
visited = [[False for _ in range(col)] for _ in range(row)]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

for i in range(row):
    for j in range(col):
        if box[i][j] == 1 and not visited[i][j]:
            q.append((i, j, 0))
ans = 0

while q:
    x, y, cnt = q.popleft()
    ans = cnt
    visited[x][y] = True
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < row and 0 <= ny < col and not visited[nx][ny] and not box[nx][ny]:
            visited[nx][ny] = True
            box[nx][ny] = 1
            q.append((nx,ny,cnt+1))
sign = True
for i in range(row):
    if not sign:
        break
    for j in range(col):
        if box[i][j] == 0:
            sign = False

if sign:
    print(ans)
else:
    print(-1)