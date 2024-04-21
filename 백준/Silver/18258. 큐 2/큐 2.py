import sys
from collections import deque

q = deque()

for tc in range(int(sys.stdin.readline().rstrip())):
    order = list(sys.stdin.readline().rstrip().split())

    if order[0] == 'push':
        q.append(int(order[1]))
    elif order[0] == 'pop':
        if len(q) == 0:
            print(-1)
        else:
            num = q.popleft()
            print(num)
    elif order[0] == 'size':
        print(len(q))
    elif order[0] == 'empty':
        if len(q) == 0:
            print(1)
        else:
            print(0)
    elif order[0] == 'front':
        if len(q) == 0:
            print(-1)
        else:
            print(q[0])
    else:
        if len(q) == 0:
            print(-1)
        else:
            print(q[-1])

