import sys
from collections import deque

n = int(sys.stdin.readline().rstrip())

m = int(sys.stdin.readline().rstrip())

graph = [[] for _ in range(n+1)]
visited = [False] * (n+1)

ans = 0

for _ in range(m):
    x,y = map(int,sys.stdin.readline().rstrip().split())
    graph[x].append(y)
    graph[y].append(x)


def bfs(v):
    global ans

    q = deque()
    q.append(v)
    visited[v] = True

    while q:
        now = q.popleft()
        for temp in graph[now]:
            if not visited[temp]:
                visited[temp] = True
                q.append(temp)
                ans += 1



bfs(1)
print(ans)