import sys
from collections import deque

dx = [-2,-1,1,2,2,1,-1,-2]
dy = [1,2,2,1,-1,-2,-2,-1]


def bfs(x, y):
    q = deque()
    q.append((x, y))
    while q:
        a, b = q.popleft()
        if a == end_x and b == end_y:
            return arr[a][b]
        for i in range(8):
            nx = a + dx[i]
            ny = b + dy[i]
            if 0 <= nx < n and 0 <= ny < n and not arr[nx][ny]:
                arr[nx][ny] += arr[a][b] + 1
                q.append((nx,ny))


for tc in range(int(sys.stdin.readline().rstrip())):
    n = int(sys.stdin.readline().rstrip())

    arr = [[0 for _ in range(n)] for _ in range(n)]
    start_x, start_y = map(int,sys.stdin.readline().rstrip().split())
    end_x,end_y = map(int,sys.stdin.readline().rstrip().split())
    print(bfs(start_x,start_y))



