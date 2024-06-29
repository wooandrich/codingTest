import sys
import math

input = sys.stdin.readline


def find(k):
    if parent[k] != k:
        parent[k] = find(parent[k])
    return parent[k]


def union(p, q):
    p = find(p)
    q = find(q)

    if p < q:
        parent[q] = p
    else:
        parent[p] = q


n = int(input())

parent = [0] * (n+1)

for i in range(1,n+1):
    parent[i] = i;

edges = []
arr = []
ans = 0

for i in range(1, n + 1):
    x, y = map(float, input().split())
    arr.append((i, x, y))

for i in range(n - 1):
    a = arr[i][1]
    b = arr[i][2]
    for j in range(i + 1, n):
        c = arr[j][1]
        d = arr[j][2]
        distance = math.sqrt((a - c) ** 2 + (b - d) ** 2)
        distance = round(distance, 2)

        edges.append((distance, i + 1, j + 1))
edges.sort()

for edge in edges:
    distance, x, y = edge

    if find(x) != find(y):
        union(x, y)
        ans += distance
print(ans)
