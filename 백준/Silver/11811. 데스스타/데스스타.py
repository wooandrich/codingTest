import sys

input = sys.stdin.readline

n = int(input())

arr = [list(map(int,input().split())) for _ in range(n)]

result = [0 for _ in range(n)]

for i in range(n):
    for j in range(n):
        if i==j:
            continue
        result[i] |= arr[i][j]
print(*result)