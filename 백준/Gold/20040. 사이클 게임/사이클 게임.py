import sys

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


n,m = map(int,input().split())

cycle = 0
parent = [i for i in range(n)]

for i in range(1,m+1):
    a,b = map(int,input().split())
    if find(a) == find(b):
        cycle = i
        break
    else:
        union(a,b)
if cycle == 0:
    print(0)
else:
    print(cycle)


