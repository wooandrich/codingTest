import sys

def find_union(parent, x):
    if parent[x] != x:
        parent[x] = find_union(parent, parent[x])
    return parent[x]

def union(a,b):
    a = find_union(parent,a)
    b = find_union(parent,b)

    if a != b:
        parent[b] = a
        num[a] += num[b]
    print(num[a])


input = sys.stdin.readline


for tc in range(int(input())):
    f = int(input())
    parent, num = {},{}

    for _ in range(f):
        a,b = input().strip().split()
        if a not in parent:
            parent[a] = a
            num[a] = 1
        if b not in parent:
            parent[b] = b
            num[b] = 1
        union(a,b)




