import sys

input = sys.stdin.readline
sys.setrecursionlimit(10**9)

# 크루스칼

def _union(a,b):
    a = _find(a)
    b = _find(b)

    if a < b:
        parent[b] = a
    else:
        parent[a] = b

def _find(a):
    if parent[a] == a:
        return a
    else:
        parent[a] = _find(parent[a])
        return parent[a]


n,m = map(int,input().split())

links = [list(map(int,input().split())) for i in range(m)]
links.sort(key=lambda x:x[2])
parent = [i for i in range(n+1)]

ans = 0

for i in range(m):
    a = links[i][0]
    b = links[i][1]
    weight = links[i][2]

    a = _find(a)
    b = _find(b)

    if a == b:
        continue
    else:
        _union(a,b)
        ans += weight
print(ans)



