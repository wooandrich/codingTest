import sys
import heapq

input = sys.stdin.readline
INF = int(1e9)

n = int(input())

m = int(input())

graph = [[] for _ in range(n+1)]
distance = [INF] * (n+1)
prev_node = [0] * (n+1)

for _ in range(m):
    a,b,c = map(int,input().split())
    graph[a].append((b,c))

def dijkstra(start):
    q = []
    heapq.heappush(q, (0,start))
    distance[start] = 0
    while q:
        dist, now = heapq.heappop(q)
        if distance[now] < dist:
            continue
        for i in graph[now]:
            cost = dist + i[1]
            if cost < distance[i[0]]:
                distance[i[0]] = cost
                prev_node[i[0]] = now
                heapq.heappush(q, (cost, i[0]))
start,end = map(int,input().split())
dijkstra(start)
print(distance[end])

path = [end]
now = end
while now != start:
    now = prev_node[now]
    path.append(now)
path.reverse()
print(len(path))
print(*path)



