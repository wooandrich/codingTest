import sys
sys.setrecursionlimit(10**8)

n,m,r = map(int,sys.stdin.readline().rstrip().split())

graph = [[] for _ in range(n+1)]
visited = [False] * (n+1)
answer = [0] * (n+1)
cnt = 1

for _ in range(m):
    x,y = map(int,sys.stdin.readline().rstrip().split())
    graph[x].append(y)
    graph[y].append(x)

def dfs(v):
    global cnt
    visited[v] = True

    answer[v] = cnt

    graph[v].sort(reverse=True)
    for i in graph[v]:
        if not visited[i]:
            cnt += 1
            dfs(i)




dfs(r)

for val in answer[1:]:
    print(val)