import sys
from collections import deque

n,m,r = map(int,sys.stdin.readline().rstrip().split())

graph = [[] for _ in range(n+1)]
visited = [False] * (n+1)
ans = [0] * (n+1)

cnt = 1

for _ in range(m):
    x,y = map(int,sys.stdin.readline().rstrip().split())
    graph[x].append(y)
    graph[y].append(x)

def bfs(v):
    global cnt

    q = deque()
    q.append((v,1))
    visited[v] = True
    ans[v] = cnt
    cnt += 1

    while q:
        v,k = q.popleft()
        graph[v].sort(reverse=True)
        for data in graph[v]:
            if not visited[data]:
                ans[data] = cnt
                cnt += 1
                visited[data] = True
                q.append((data,1))

bfs(r)

for val in ans[1:]:
    print(val)