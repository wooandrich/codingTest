import sys
from collections import deque

input = sys.stdin.readline

for tc in range(int(input())):
    # 노드의 개수 입력 받기
    n = int(input())

    # 모든 노드에 대한 집입차수는 0으로 초기화
    indegree = [0] * (n+1)

    # 각 노드에 연결된 간선 정보를 담기 위한 인접행렬 초기화
    graph = [[False] * (n+1) for i in range(n+1)]

    # 작년 순위 정보입력
    data = list(map(int, input().split()))
    # 방향 그래프의 간선 정보 초기화
    for i in range(n):
        for j in range(i+1,n):
            graph[data[i]][data[j]] = True
            indegree[data[j]] += 1

    # 올해 변경된 순위 정보입력
    m = int(input())
    for i in range(m):
        a,b = map(int, input().split())
        # 간선의 방향 뒤집기
        if graph[a][b]:
            graph[a][b] = False
            graph[b][a] = True
            indegree[a] += 1
            indegree[b] -= 1
        else:
            graph[a][b] = True
            graph[b][a] = False
            indegree[a] -= 1
            indegree[b] += 1

    # 위상 정렬 시작
    result = []
    q = deque()

    # 처음 시작할때는 진입차수가 0인 노드를 큐에 삽입
    for i in range(1,n+1):
        if indegree[i] == 0:
            q.append(i)

    certain = True # 위상 정렬 결과가 오직 하나인지의 여부
    cycle = False # 그래프 내 사이클여부

    # 정확히 노드의 개수만큼 반복
    for i in range(n):
        # 큐가 비어있다면 사이클이 발생했다는것을 의미
        if len(q) == 0:
            cycle = True
            break
        if len(q) >= 2: # 큐의 원소가 2개 이상이라면 가능한 정렬 결과가 여러개를 의미
            certain = False
            break

        now = q.popleft()
        result.append(now)
        # 해당 원소와 연결된 노드들의 진입차수를 1씩 빼기
        for j in range(1,n+1):
            if graph[now][j]:
                indegree[j] -= 1
                # 새롭게 진입차수가 0이 되는 노드를 큐에 삽입
                if indegree[j] == 0:
                    q.append(j)

    if cycle:
        print("IMPOSSIBLE")
    elif not certain:
        print("?")
    else:
        for i in result:
            print(i,end=' ')
        print()
