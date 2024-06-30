import sys
import math

input = sys.stdin.readline


def find(x):
    if parent[x] != x:
        parent[x] = find(parent[x])
    return parent[x]


def union(x, y):
    x = find(x)
    y = find(y)

    if x < y:
        parent[y] = x
    else:
        parent[x] = y


n, m = map(int, input().split())

parent = [0] * (n + 1)
arr = []
edges = []
ans = 0
for i in range(1, n + 1):
    parent[i] = i

for i in range(1, n + 1):
    x, y = map(int, input().split())
    arr.append((i, x, y))

for i in range(n - 1):
    num, a, b = arr[i]
    for j in range(i + 1, n):
        new, c, d = arr[j]
        distance = math.sqrt((a-c)**2+(b-d)**2)
        edges.append((distance, num, new))
edges.sort()

for _ in range(m):
    x, y = map(int, input().split())
    union(x, y)

for edge in edges:
    distance, num, new = edge
    if find(num) != find(new):
        ans += distance
        union(num, new)
print(format(ans, ".2f"))
