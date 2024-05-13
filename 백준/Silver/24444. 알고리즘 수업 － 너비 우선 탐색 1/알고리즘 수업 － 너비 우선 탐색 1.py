import sys
from collections import deque

n,m,r = map(int, sys.stdin.readline().rstrip().split())

graph = [[] for _ in range(n+1)]
visited = [False] * (n+1)
ans = [0] * (n+1)
cnt = 1

q = deque()

for _ in range(m):
    x,y = map(int, sys.stdin.readline().rstrip().split())
    graph[x].append(y)
    graph[y].append(x)



def bfs(v):
    global cnt
    visited[r] = True
    q.append(r)
    ans[v] = cnt


    while q:
        v = q.popleft()
        graph[v].sort()
        for a in graph[v]:
            if not visited[a]:
                cnt += 1
                visited[a] = True
                q.append(a)
                ans[a] = cnt




bfs(r)

for val in ans[1:]:
    print(val)