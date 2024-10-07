import sys
sys.setrecursionlimit(10000000)

input = sys.stdin.readline

n = int(input())

graph = [[] for _ in range(n+1)]
parent = [0 for _ in range(n+1)]

for _ in range(n-1):
    a,b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

def recur(node, pre):
    parent[node] = pre


    for next in graph[node]:
        if next == pre:
            continue
        recur(next, node)

recur(1,0)

for i in range(2, n+1):
    print(parent[i])

