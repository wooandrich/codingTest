import sys
import heapq

INF = int(1e9)

v,e = map(int,sys.stdin.readline().rstrip().split())

start = int(sys.stdin.readline().rstrip())

distance = [INF] * (v+1)

graph = [[] for _ in range(v+1)]

# 간선정보 입력받기
for _ in range(e):
    # a에서 b까지 c 가중치
    a,b,c = map(int, sys.stdin.readline().rstrip().split())
    graph[a].append((b,c))

def dijkstra(start):
    q = []
    heapq.heappush(q, (0,start))
    distance[start] = 0

    while q:
        dist, now = heapq.heappop(q)
        # 현재 노드가 이미 처리된적 있으면 무시
        if dist > distance[now]:
            continue
        # 현재 노드와 인접한 노드들 확인
        for i in graph[now]:
            cost = dist + i[1]
            # 현재 노드를 거쳐서, 다른 노드로 이동하는 거리가 더 짧은 경우
            if cost < distance[i[0]]:
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))
dijkstra(start)

for i in range(1, v+1):
    if distance[i] >= INF:
        print("INF")
    else:
        print(distance[i])



