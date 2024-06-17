import sys

sys.setrecursionlimit(10 ** 9)

input = sys.stdin.readline


def findCycle(start):
    for adj_node in graph[start]:
        if parent[start] == adj_node:
            continue
        if visited[adj_node]:
            return True

        parent[adj_node] = start
        visited[adj_node] = 1

        if findCycle(adj_node):
            return True

    return False


n, m = map(int, input().split())
case = 1

while n != 0 or m != 0:
    graph = [[] for _ in range(n + 1)]
    parent = [-1] * (n + 1)
    visited = [0] * (n + 1)

    count = 0

    for _ in range(m):
        a, b = map(int, input().split())
        graph[a].append(b)
        graph[b].append(a)

    for node in range(1, n + 1):
        if visited[node] == 0:
            parent[node] = node
            visited[node] = 1
            if not findCycle(node):
                count += 1

    if count == 0:
        print(f'Case {case}: No trees.')
    elif count == 1:
        print(f'Case {case}: There is one tree.')
    else:
        print(f'Case {case}: A forest of {count} trees.')

    case += 1

    n, m = map(int, input().split())
