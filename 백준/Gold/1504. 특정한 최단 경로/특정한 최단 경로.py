import sys
import heapq
input = sys.stdin.readline

INF = int(1e9)

n,m = map(int,input().split())

#시작노드는 1고정

graph = [[] for _ in range(n+1)]


#모든 간선정보입력받기
for _ in range(m):
    a,b,c = map(int,input().split())
    graph[a].append((b,c))
    graph[b].append((a,c))


def dijkstra(start):
    distance = [INF] * (n + 1)
    q = []
    # 시작노드로 가기 위한 최단 경로는 0으로 설정하여, 큐에 삽입
    heapq.heappush(q, (0,start))
    distance[start] = 0
    while q:
        # 가장 최단 거리가 짧은 노드에 대한 정보꺼내기
        dist, now = heapq.heappop(q)
        # 이미 처리된 노드면 무시
        if distance[now] < dist:
            continue
        # 현재 노드와 인접한 노드들을 확인
        for i in graph[now]:
            cost = dist + i[1]
            # 현재 노드를 거쳐서, 다른 노드로 이동하는 거리가 더 짧을 경우
            if cost < distance[i[0]]:
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))
    return distance


v1, v2 = map(int, input().split())
original = dijkstra(1)
v1_dis = dijkstra(v1)
v2_dis = dijkstra(v2)

v1_path = original[v1] + v1_dis[v2] + v2_dis[n]
v2_path = original[v2] + v2_dis[v1] + v1_dis[n]

ans = min(v1_path, v2_path)

if ans < INF:
    print(ans)
else:
    print(-1)
