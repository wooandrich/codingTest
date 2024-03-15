import sys
from collections import deque

a, b = map(int, sys.stdin.readline().rstrip().split())

q = deque()
q.append((a,1))

ans = 0


while q:
    now,cnt = q.popleft()

    if now == b:
        ans = cnt
        break

    num1 = now * 2
    num2 = int(str(now) + "1")
    if num1 <= b:
        q.append((num1, cnt + 1))
    if num2 <= b:
        q.append((num2, cnt + 1))

if ans == 0:
    print(-1)
else:
    print(ans)
