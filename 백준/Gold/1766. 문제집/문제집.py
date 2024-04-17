import heapq
import sys

n,m = map(int,sys.stdin.readline().rstrip().split())

indegree = [0] * (n+1)
graph = [[] for _ in range(n+1)]


for i in range(m):
    a,b = map(int,sys.stdin.readline().rstrip().split())
    graph[a].append(b)
    indegree[b] += 1



def topology_sort():
    result = []
    q = []

    # 처음 시작할때는 진입차수가 0인 노드 삽입
    for i in range(1,n+1):
        if indegree[i] == 0:
            heapq.heappush(q,i)


    while q:
        now = heapq.heappop(q)
        result.append(now)

        # 해당 원소와 연결된 노드들의 진입차수 1 빼기
        for i in graph[now]:
            indegree[i] -= 1
            # 새롭게 진입차수가 0이 되면 큐 삽입
            if indegree[i] == 0:
                heapq.heappush(q,i)
    for i in result:
        print(i,end=' ')
topology_sort()
