import sys
input = sys.stdin.readline

INF = int(1e9)

n,m = map(int, input().split())

distance = [INF] * (n+1)
graph = []

for _ in range(m):
    a,b,c = map(int,input().split())
    graph.append((a,b,c))




def bf(start):
    distance[start] = 0
    # 전체 n-1번을 반복
    for i in range(n):
        # 매 반복마다 모든 간선을 확인
        for j in range(m):
            now_node = graph[j][0]
            next_node = graph[j][1]
            edge_cost = graph[j][2]
            # 현재 간선을 거쳐서 다른노드로 이동하는게 더 짧은경우
            if distance[now_node] != INF and distance[now_node] + edge_cost < distance[next_node]:
                distance[next_node] = distance[now_node] + edge_cost
                # n번째 라운드에서도 값이 생긴된다면 음수 사이클 발생
                if i == n-1:
                    return True
    return False

if bf(1):
    print(-1)
else:
    for val in range(2,n+1):
        if distance[val] == INF:
            print(-1)
        else:
            print(distance[val])
