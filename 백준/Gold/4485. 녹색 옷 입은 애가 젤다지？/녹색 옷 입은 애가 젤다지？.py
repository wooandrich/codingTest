import sys
import heapq

INF = int(1e9)

dx = [-1,0,1,0]
dy = [0,1,0,-1]

cnt = 1


n = int(sys.stdin.readline().rstrip())

while n != 0:
    distance = [[INF] * n for _ in range(n)]
    graph = []

    for i in range(n):
        graph.append(list(map(int, sys.stdin.readline().rstrip().split())))


    # 시작 위치는 (0,0)
    x,y = 0,0

    # 시작 노드로 가기 위한 비용은 (0,0) 위치의 값으로 설정하여, 큐에 삽입
    q = [(graph[x][y], x, y)]
    distance[x][y] = graph[x][y]

    while q:
        dist, x, y = heapq.heappop(q)
        # 현재 노드가 처리된적 있으면 무시
        if dist > distance[x][y]:
            continue
        # 현재 노드와 연결된 다른 인접한 노드들 확인
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue
            cost = dist + graph[nx][ny]
            # 현재 노드를 거쳐서, 다른 노드로 이동하는 거리가 더 짧은 경우
            if cost < distance[nx][ny]:
                distance[nx][ny] = cost
                heapq.heappush(q, (cost, nx,ny))
    print("Problem", str(cnt) + ":",distance[n-1][n-1])

    n = int(sys.stdin.readline().rstrip())

    cnt += 1
