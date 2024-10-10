import sys
import heapq

input = sys.stdin.readline

# 프림

n,m = map(int,input().split())

graph = [[] for _ in range(n+1)]
visited = [0 for _ in range(n+1)]

for _ in range(m):
    a,b,c = map(int,input().split())
    graph[a].append([c,b])
    graph[b].append([c,a])

q = [[0,1]]
ans = 0
cnt = 0

while q:
    if cnt == n:
        break
        
    weight, node = heapq.heappop(q)


    if visited[node] == 0:
        visited[node] = 1
        ans += weight
        cnt += 1
        for nxt in graph[node]:
            heapq.heappush(q,nxt)
print(ans)