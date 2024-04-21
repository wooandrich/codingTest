import sys
from collections import deque

n = sys.stdin.readline().rstrip()


q = deque(enumerate(map(int,sys.stdin.readline().rstrip().split())))

ans = []

idx, paper = q.popleft()
ans.append(idx+1)

while len(q) != 0:
    if paper > 0:
        q.rotate(-paper + 1)
        idx, paper = q.popleft()
        ans.append(idx+1)
    else:
        q.rotate(-paper)
        idx, paper = q.popleft()
        ans.append(idx+1)

print(" ".join(map(str,ans)))





