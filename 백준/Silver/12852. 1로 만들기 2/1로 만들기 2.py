import sys
from collections import deque

input = sys.stdin.readline

n = int(input())

q = deque()
q.append([n])

ans = []


while q:
    temp = q.popleft()
    x = temp[0]
    if x == 1:
        ans = temp
        break

    if x % 3 == 0:
        q.append([x//3] + temp)
    if x % 2 == 0:
        q.append([x//2] + temp)
    q.append([x-1] + temp)
print(len(ans)-1)
print(*ans[::-1])















