import sys

sys.setrecursionlimit(100000000)


input = sys.stdin.readline


def find_parent(parent, x):
    if parent[x] != x:
        if parent[x] == 0:
            return 0
        else:
            parent[x] = find_parent(parent, parent[x])
    return parent[x]


g = int(input())
p = int(input())

parent = [i for i in range(g + 1)]

ans = 0

for _ in range(p):
    place = int(input())
    k = find_parent(parent, place)

    if k == 0:
        break
    else:
        parent[k] -= 1
        ans += 1

print(ans)
