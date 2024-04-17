import sys

t = int(sys.stdin.readline().rstrip())

def find_parent(parent, x):
    # 루트가 아닐 경우
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

for _ in range(t):
    n,m = map(int, sys.stdin.readline().rstrip().split())

    edges = []

    ans = 0

    parent = [0] * (n+1)

    for i in range(1,n+1):
        parent[i] = i

    for _ in range(m):
        a,b = map(int,sys.stdin.readline().rstrip().split())
        edges.append((a,b))

    for edge in edges:
        a,b = edge
        if find_parent(parent, a) != find_parent(parent, b):
            union_parent(parent, a,b)
            ans += 1
    print(ans)

