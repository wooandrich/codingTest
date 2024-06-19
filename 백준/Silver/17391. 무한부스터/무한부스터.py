import sys
from collections import deque

dx = [0,1]
dy = [1,0]

input = sys.stdin.readline

n,m = map(int,input().split())

arr = [list(map(int,input().split())) for _ in range(n)]


visited = [[0 for _ in range(m)] for _ in range(n)]

q = deque()

q.append((0,0,0))
visited[0][0] = 1

while q:
    x,y,ans = q.popleft()
    if x == n-1 and y == m-1:
        print(ans)
        exit()
    now_boost = arr[x][y]
    for i in range(2):
        for j in range(1, now_boost + 1):
            nx = x + dx[i] * j
            ny = y + dy[i] * j
            if 0<=nx<n and 0<=ny<m and visited[nx][ny] == 0:
                q.append((nx,ny,ans+1))
                visited[nx][ny] = 1
