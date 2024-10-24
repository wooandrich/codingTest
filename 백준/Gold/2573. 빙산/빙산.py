import sys
from collections import deque

input = sys.stdin.readline

def check():
    for i in range(n):
        for j in range(m):
            if graph[i][j] != 0:
                return True
    return False

def down():
    temp = []
    for i in range(n):
        for j in range(m):
            if graph[i][j] != 0:
                cnt = 0
                for k in [[-1, 0], [1, 0], [0, -1], [0, 1]]:
                    nx = i + k[0]
                    ny = j + k[1]
                    if 0 <= nx < n and 0 <= ny < m:
                        if graph[nx][ny] == 0:
                            cnt += 1
                temp.append((i, j, cnt))
    for x,y,cnt in temp:
        graph[x][y] -= cnt
        if graph[x][y] < 0:
            graph[x][y] = 0


def bfs():
    visited = [[False for _ in range(m)] for _ in range(n)]
    cnt = 0
    q = deque()
    for i in range(n):
        for j in range(m):
            if graph[i][j] != 0 and not visited[i][j]:
                cnt += 1
                q.append((i, j))
                visited[i][j] = True
                while q:
                    x, y = q.popleft()
                    for k in [[-1, 0], [1, 0], [0, -1], [0, 1]]:
                        nx = x + k[0]
                        ny = y + k[1]
                        if 0 <= nx < n and 0 <= ny < m:
                            if graph[nx][ny] != 0 and not visited[nx][ny]:
                                q.append((nx, ny))
                                visited[nx][ny] = True
    if cnt >= 2:
        return True
    else:
        return False


n,m = map(int,input().split())

graph = [list(map(int,input().split())) for i in range(n)]

ans = 0

while 1:
    if bfs():
        break;

    if not check():
        ans = 0
        break

    down()
    ans += 1

print(ans)
