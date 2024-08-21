import sys

input = sys.stdin.readline

INF = int(1e9)

n,m = map(int,input().split())

graph = [[INF] * (n + 1) for _ in range(n+1)]

for a in range(1, n+1):
    for b in range(1, n+1):
        if a == b:
            graph[a][b] = 0
            graph[b][a] = 0

for _ in range(m):
    a,b = map(int,input().split())
    graph[a][b] = 1
    graph[b][a] = 1

for k in range(1, n+1):
    for i in range(1,n+1):
        for j in range(1,n+1):
            graph[i][j] = min(graph[i][j], graph[i][k] + graph[k][j])
ans = 0
cnt = INF
for i in range(1,n+1):
    temp = sum(graph[i][1:n+1])
    if temp < cnt:
        cnt = temp
        ans = i
print(ans)

