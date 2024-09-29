import sys
from collections import deque

input = sys.stdin.readline


def bfs(x, y):
    visited = [[-1 for _ in range(m)] for _ in range(n)]
    q = deque()
    q.append((x, y))
    visited[x][y] = 0
    cnt = 0
    while q:
        x, y = q.popleft()
        for dx, dy in [[-1, 0], [1, 0], [0, 1], [0, -1]]:
            nx = x + dx
            ny = y + dy
            if 0 <= nx < n and 0 <= ny < m:
                if visited[nx][ny] == -1 and graph[nx][ny] == "L":
                    q.append((nx, ny))
                    visited[nx][ny] = visited[x][y] + 1
                    cnt = max(cnt, visited[nx][ny])
    return cnt


n, m = map(int, input().split())

graph = [list(input().rstrip()) for _ in range(n)]

ans = 0

for i in range(n):
    for j in range(m):
        if graph[i][j] == "L":
            ans = max(ans, bfs(i, j))
print(ans)
