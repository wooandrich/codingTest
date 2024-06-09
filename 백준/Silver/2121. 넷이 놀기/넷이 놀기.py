import sys

input = sys.stdin.readline

n = int(input())

a,b = map(int,input().split())

c = set()

for _ in range(n):
    c.add(tuple(map(int,input().split())))
cnt = 0
for data in c:
    if (data[0] + a, data[1]) in c and (data[0], data[1]+b) in c and (data[0] + a, data[1] + b) in c:
        cnt += 1
print(cnt)


