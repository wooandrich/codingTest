import sys

sys.setrecursionlimit(10 ** 9)


def _union(a, b):
    a = _find(a)
    b = _find(b)

    parent[b] = a


def _find(a):
    if parent[a] == a:
        return a
    else:
        parent[a] = _find(parent[a])
        return _find(parent[a])


input = sys.stdin.readline

n, m = map(int, input().split())

parent = [i for i in range(n + 1)]

for _ in range(m):
    x, a, b = map(int, input().split())

    if x == 0:
        _union(a, b)
    else:
        if _find(a) == _find(b):
            print("YES")
        else:
            print("NO")
