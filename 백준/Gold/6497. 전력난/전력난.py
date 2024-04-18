import sys

input = sys.stdin.readline

def find_parent(parent, x):
    if parent[x] != x:
        parent[x] = find_parent(parent, parent[x])
    return parent[x]

def union_parent(parent, a,b):
    a = find_parent(parent,a)
    b = find_parent(parent,b)

    if a < b:
        parent[b] = a
    else:
        parent[a] = b




while 1:
    # 집의 수 : m, 길의 수 : n
    m, n = map(int, input().split())
    if m == 0 and n == 0:
        break
    parent = [i for i in range(m)]
    edges = []
    ans = 0

    for _ in range(n):
        a,b,c = map(int, input().split())
        edges.append((c,a,b))


    edges.sort()

    for edge in edges:
        cost, a, b = edge
        if find_parent(parent, a) != find_parent(parent,b):
            union_parent(parent,a,b)
        else:
            ans += cost
    print(ans)