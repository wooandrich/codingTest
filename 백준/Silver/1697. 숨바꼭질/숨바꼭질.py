import sys
from collections import deque
MAX = 10**5
arr = [0] * (MAX+1)

n,k = map(int,sys.stdin.readline().rstrip().split())


def bfs(n):

    q = deque()
    q.append(n)

    while q:
        now = q.popleft()
        if now == k:
            return arr[now]
        for x in (now - 1, now + 1, now * 2):
            if 0<=x<=MAX and not arr[x]:
                arr[x] += arr[now] + 1
                q.append(x)

print(bfs(n))
