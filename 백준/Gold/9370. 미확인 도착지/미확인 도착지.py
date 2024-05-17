import sys
import heapq
input = sys.stdin.readline

INF = int(1e9)

def dijkstra(start, end):
    q = []
    distance = [INF] * (n + 1)
    distance[start]= 0

    heapq.heappush(q, (0,start))
    while q:
        dist, now = heapq.heappop(q)
        if distance[now] < dist:
            continue
        for i in graph[now]:
            cost = dist + i[1]
            if cost < distance[i[0]]:
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))
    return distance[end]

for tc in range(int(input())):
    ans = []
    n,m,t = map(int, input().split())
    s,g,h = map(int, input().split())

    graph = [[] for _ in range(n+1)]


    for _ in range(m):
        a,b,c = map(int, input().split())
        graph[a].append((b,c))
        graph[b].append((a,c))

    candidate = []

    for _ in range(t):
        candidate.append(int(input()))

    # s -> g -> h -> t == s -> t
    # s -> h -> g -> t == s -> t
    for candi in candidate:
        original_path = dijkstra(s, candi)
        path_1 = dijkstra(s,g) + dijkstra(g,h) + dijkstra(h,candi)
        path_2 = dijkstra(s,h) + dijkstra(h,g) + dijkstra(g,candi)

        if original_path == path_1 or original_path == path_2:
            ans.append(candi)
    ans.sort()
    print(*ans)












