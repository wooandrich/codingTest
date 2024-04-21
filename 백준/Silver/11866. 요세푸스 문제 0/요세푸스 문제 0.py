import sys
from collections import deque

q = deque()

n,k = map(int, sys.stdin.readline().rstrip().split())

for i in range(1,n+1):
    q.append(i)

ans = []
cnt = 0
while len(q) != 1:
    if cnt != k-1:
        q.append(q.popleft())
        cnt += 1
    else:
        ans.append(q.popleft())
        cnt = 0
ans.append(q.popleft())

print("<"+", ".join(map(str,ans)) + ">")





