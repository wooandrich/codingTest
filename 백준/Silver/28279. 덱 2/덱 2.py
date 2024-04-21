import sys
from collections import deque

q = deque()

for tc in range(int(sys.stdin.readline().rstrip())):
    order = list(map(int, sys.stdin.readline().rstrip().split()))

    if order[0] == 1:
        q.appendleft(order[1])
    elif order[0] == 2:
        q.append(order[1])
    elif order[0] == 3:
        if len(q) == 0:
            print(-1)
        else:
            print(q.popleft())
    elif order[0] == 4:
        if len(q) == 0:
            print(-1)
        else:
            print(q.pop())
    elif order[0] == 5:
        print(len(q))
    elif order[0] == 6:
        if len(q) == 0:
            print(1)
        else:
            print(0)
    elif order[0] == 7:
        if len(q) == 0:
            print(-1)
        else:
            print(q[0])
    else:
        if len(q) == 0:
            print(-1)
        else:
            print(q[-1])





