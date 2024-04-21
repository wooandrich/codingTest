import sys
from collections import deque

n = int(sys.stdin.readline().rstrip())

q = deque()

result = []

info = list(map(int, sys.stdin.readline().rstrip().split()))
arr = list(map(int, sys.stdin.readline().rstrip().split()))

for i in range(len(arr)):
    if info[i] == 0:
        q.append(arr[i])
m = int(sys.stdin.readline().rstrip())
c = list(map(int, sys.stdin.readline().rstrip().split()))

if len(q) == 0:
    print(" ".join(map(str,c)))
else:
    for i in c:
        q.appendleft(i)
        result.append(q.pop())
    print(" ".join(map(str,result)))






