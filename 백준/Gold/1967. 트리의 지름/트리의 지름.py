import sys
from collections import deque

def bfs(start):
    q = deque()
    q.append((start, 0))
    visited[start] = 0
    while q:
        node, dist = q.popleft()

        for child, cnt in tree[node]:
            distance = dist + cnt
            if visited[child] == -1:
                visited[child] = distance
                q.append((child, distance))


input = sys.stdin.readline

n = int(input())

tree = [[] for _ in range(n+1)]
visited = [-1] * (n+1)

for _ in range(n-1):
    a,b,c = map(int,input().split())
    tree[a].append((b,c))
    tree[b].append((a,c))


bfs(1)

max_node = visited.index(max(visited))

visited = [-1] * (n+1)
visited[max_node] = 0
bfs(max_node)
print(max(visited))

