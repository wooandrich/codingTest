import sys
import heapq
input = sys.stdin.readline

INF = int(1e9)

n,k = map(int, input().split())

distance = [INF] * 100001
q = []





def dijkstra(start, end):
    if end <= start:
        print(start - end)
        return

    heapq.heappush(q, (0, start))
    while q:
        dist, now = heapq.heappop(q)
        for nx in (now - 1, now + 1, now * 2):
            if 0<=nx<=100000:
                if nx == now * 2 and distance[nx] == INF:
                    distance[nx] = dist
                    heapq.heappush(q, (dist, nx))
                elif distance[nx] == INF:
                    distance[nx] = dist + 1
                    heapq.heappush(q, (dist+1, nx))
    print(distance[end])
dijkstra(n,k)


