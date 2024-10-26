import sys
sys.setrecursionlimit(10**6)

input = sys.stdin.readline


def _union(a,b):
    a = _find(a)
    b = _find(b)

    if a <= b:
        parent[b] = a
    else:
        parent[a] = b


def _find(a):
    if parent[a] == a:
        return a
    else:
        parent[a] = _find(parent[a])
        return parent[a]



n = int(input())
m = int(input())

computer = []

for _ in range(m):
    a,b,c = map(int, input().split())
    computer.append((a,b,c))

ans = 0
parent = [i for i in range(n+1)]

computer.sort(key=lambda x:x[2])

for nodes in computer:
    a,b,c = nodes
    if _find(a) != _find(b):
        _union(a,b)
        ans += c
print(ans)