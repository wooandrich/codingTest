import sys


def find_parent(parent, x):
    # 루트노드가 아니라면
    if parent[x] != x:
        parent[x] = find_parent(parent, parent[x])
    return parent[x]


def union_parent(parent, a, b):
    a = find_parent(parent, a)
    b = find_parent(parent, b)
    if a < b:
        parent[b] = a
    else:
        parent[a] = b


n = int(sys.stdin.readline().rstrip())
m = int(sys.stdin.readline().rstrip())

parent = [i for i in range(n + 1)]

for i in range(1,n+1):
    arr = list(map(int, sys.stdin.readline().rstrip().split()))
    for j in range(n):
        if arr[j] == 1:
            union_parent(parent, i, j+1)

trips = list(map(int, sys.stdin.readline().rstrip().split()))

ans = "YES"

sign = parent[trips[0]]

for trip in trips:
    if sign != parent[trip]:
        ans = "NO"
        break
print(ans)
