import sys
import heapq

input = sys.stdin.readline
INF = int(1e9)

n = int(input())

m = int(input())

graph = [[INF] * (n+1) for _ in range(n+1)]
path = [[()]*(n+1) for _ in range(n+1)]

for _ in range(m):
    a,b,c = map(int,input().split())
    graph[a][b] = min(graph[a][b], c)
    path[a][b] = (a,b)

for k in range(1,n+1):
    for a in range(1,n+1):
        for b in range(1,n+1):
            if a == b:
                continue
            cost = graph[a][k] + graph[k][b]
            if cost < graph[a][b]:
                graph[a][b] = cost
                path[a][b] = path[a][k] + path[k][b][1:]

for i in range(1,n+1):
    for j in range(1,n+1):
        if graph[i][j] == INF:
            print(0, end=' ')
        else:
            print(graph[i][j], end=' ')
    print()
for i in range(1,n+1):
    for j in range(1,n+1):
        if graph[i][j] == INF:
            print(0)
        else:
            print(len(path[i][j]), *path[i][j])




            