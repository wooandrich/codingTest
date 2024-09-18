import sys

input = sys.stdin.readline

row, col = map(int, input().split())

up = [0] * (col + 1)
down = [0] * (col + 1)

for i in range(row):
    num = int(input())
    if i % 2 == 0:
        up[0] += 1
        up[num] += -1
    else:
        down[col - num] += 1
        down[col] += -1


up[0] += down[0]
for i in range(1,col):
    up[i] += up[i - 1] + down[i]
a = min(up[:col])
print(a, up[:col].count(a))


