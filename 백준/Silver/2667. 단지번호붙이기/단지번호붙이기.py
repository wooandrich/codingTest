import sys
from collections import deque

n = int(sys.stdin.readline().rstrip())

arr = []
visited = [[False for _ in range(n)] for _ in range(n)]

for _ in range(n):
    arr.append(list(map(int,sys.stdin.readline().rstrip())))

dx = [-1,1,0,0]
dy = [0,0,-1,1]

ans = []

def bfs(x,y):
    cnt = 1

    q = deque()
    q.append((x,y))
    visited[x][y] = True

    while q:
        a,b = q.popleft()
        for i in range(4):
            nx = a + dx[i]
            ny = b + dy[i]
            if 0<= nx < n and 0<=ny<n and not visited[nx][ny]:
                if arr[nx][ny] == 1:
                    visited[nx][ny] = True
                    cnt += 1
                    q.append((nx,ny))

    return cnt

for i in range(n):
    for j in range(n):
        if arr[i][j] == 1 and not visited[i][j]:
            ans.append(bfs(i,j))
print(len(ans))

ans.sort()

print('\n'.join(map(str,ans)))
