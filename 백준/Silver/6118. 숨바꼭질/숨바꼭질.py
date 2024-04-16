import sys
import heapq

n,m = map(int, sys.stdin.readline().rstrip().split())

INF = int(1e9)

distance = [INF] * (n+1)

start = 1

graph = [[] for _ in range(n+1)]

for _ in range(m):
    a,b = map(int, sys.stdin.readline().rstrip().split())
    graph[a].append((b,1))
    graph[b].append((a,1))

def dijkstra(start):
    q = []
    heapq.heappush(q,(0,start))
    distance[start] = 0
    while q:
        dist,now = heapq.heappop(q)
        if dist > distance[now]:
            continue
        for i in graph[now]:
            cost = dist + i[1]
            if cost < distance[i[0]]:
                distance[i[0]] = cost
                heapq.heappush(q, (cost,i[0]))
dijkstra(start)

# 숨어야하는 헛간번호, 헛간까지 거리, 거리같은 헛간 개수

max_val = 0

for i in range(1,n+1):
    max_val = max(distance[i], max_val)

print(distance.index(max_val), max_val, distance.count(max_val))


