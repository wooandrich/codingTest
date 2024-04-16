import sys

INF = int(1e9)

ans = 0

n, m = map(int, sys.stdin.readline().rstrip().split())


graph = [[INF] * (n+1) for _ in range(n+1)]

# 자기자신은 가중치가 0
for i in range(1,n+1):
    for j in range(1,n+1):
        if i==j:
            graph[i][j] = 0

for _ in range(m):
    a,b = map(int, sys.stdin.readline().rstrip().split())
    graph[a][b] = 1

for k in range(1,n+1):
    for a in range(1,n+1):
        for b in range(1,n+1):
            graph[a][b] = min(graph[a][b], graph[a][k] + graph[k][b])

for i in range(1,n+1):
    sign = 1
    for j in range(1,n+1):
        if graph[i][j] >= INF:
            if graph[j][i] >= INF:
                sign = 0
    if sign == 1:
        ans += 1
print(ans)

