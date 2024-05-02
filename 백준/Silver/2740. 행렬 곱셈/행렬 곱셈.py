import sys

n,m = map(int,sys.stdin.readline().rstrip().split())

a = [list(map(int,sys.stdin.readline().rstrip().split())) for _ in range(n)]

m,k = map(int,sys.stdin.readline().rstrip().split())

b = [list(map(int,sys.stdin.readline().rstrip().split())) for _ in range(m)]

arr = [[0] * k for _ in range(n)]


for i in range(n):
    for j in range(k):
        for l in range(m):
            arr[i][j] += a[i][l] * b[l][j]

for i in arr:
    print(*i)