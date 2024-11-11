import sys
from collections import deque

input = sys.stdin.readline

def bfs():
    visited = [-1 for _ in range(top+1)]
    q = deque()
    q.append(start)
    visited[start] = 0

    while q:
        now = q.popleft()

        if now == end:
            return visited[now]
        for next_step in [now + up, now - down]:
            if 0 < next_step <= top:
                if visited[next_step] == -1:
                    visited[next_step] = visited[now] + 1
                    q.append(next_step)
    return "use the stairs"


top, start, end, up, down = map(int, input().split())

print(bfs())



