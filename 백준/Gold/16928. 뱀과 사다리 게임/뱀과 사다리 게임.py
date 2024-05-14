import sys
from collections import deque

arr = [[0 for _ in range(10)] for _ in range(10)]
visited = [[False for _ in range(10)] for _ in range(10)]

n,m = map(int,sys.stdin.readline().rstrip().split())

for _ in range(n):
    x,y = map(int,sys.stdin.readline().rstrip().split())
    x -= 1
    y -= 1
    arr[x//10][x%10] = y
for _ in range(m):
    u,v = map(int,sys.stdin.readline().rstrip().split())
    u -= 1
    v -= 1
    arr[u//10][u%10] = v

ans = 0
q = deque()
q.append((1,0))
visited[0][0] = True
while q:
    now, cnt = q.popleft()
    if now == 100:
        print(cnt)
        break
    for i in range(1,7):
        temp = now + i
        temp -= 1
        nx = temp // 10
        ny = temp % 10
        if temp < 100 and not visited[nx][ny]:
            if not arr[nx][ny]:
                visited[nx][ny] = True
                q.append((temp+1, cnt + 1))
            else:
                visited[nx][ny] = True
                temp = arr[nx][ny]
                visited[temp//10][temp%10] = True
                q.append((temp+1, cnt + 1))


