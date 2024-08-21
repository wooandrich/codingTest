import sys
import heapq

INF = int(1e9)
input = sys.stdin.readline

def dijkstra(distance, start):
    q = []
    heapq.heappush(q, (0, start))
    distance[start] = 0

    while q:
        dist, node = heapq.heappop(q)
        if distance[node] < dist:
            continue
        for i in graph[node]:
            cost = dist + i[1]
            if cost < distance[i[0]]:
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))

n,m,x = map(int,input().split())

graph = [[] for i in range(n+1)]
distance1 = [INF] * (n+1)
distance2 = [INF] * (n+1)

for _ in range(m):
    a,b,c = map(int,input().split())
    graph[a].append((b,c))

ans = 0

dijkstra(distance2, x)

for i in range(1, n+1):
    distance1 = [INF] * (n + 1)
    dijkstra(distance1, i)
    temp = distance1[x] + distance2[i]
    ans = max(ans, temp)

print(ans)

