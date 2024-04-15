INF = int(1e9)

n = int(input())
m = int(input())

graph = [[INF] * (n+1) for _ in range(n+1)]

# 자기에서 자기로 가는건 0으로 초기화
for i in range(1,n+1):
    for j in range(1,n+1):
        if i==j:
            graph[i][j] = 0

for _ in range(m):
    # a에서 b로 가는데 c 비용
    a,b,c = map(int, input().split())

    # 가장 짧은 노션만 저장
    if c < graph[a][b]:
        graph[a][b] = c

for k in range(1,n+1):
    for a in range(1,n+1):
        for b in range(1,n+1):
            graph[a][b] = min(graph[a][b], graph[a][k] + graph[k][b])



for a in range(1,n+1):
    for b in range(1,n+1):
        if graph[a][b] >= INF:
            graph[a][b] = 0
        print(graph[a][b], end=" ")
    print()
