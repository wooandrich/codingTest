import sys
from collections import deque

input = sys.stdin.readline


def D(now):
    if now * 2 < 10000:
        return now * 2
    else:
        return (now * 2) % 10000


def S(now):
    if now == 0:
        return 9999
    else:
        return now - 1


def L(now):
    temp = str(now).zfill(4)
    return int(temp[1:] + temp[:1])


def R(now):
    temp = str(now).zfill(4)
    return int(temp[-1] + temp[:-1])


def solve(a, b):
    q = deque()
    q.append((a, 0, ""))

    visited = set()
    visited.add(a)

    while q:
        now, cnt, ans = q.popleft()
        if now == b:
            return ans

        n1 = D(now)
        n2 = S(now)
        n3 = L(now)
        n4 = R(now)
        if n1 not in visited:
            q.append((n1, cnt + 1, ans + "D"))
            visited.add(n1)
        if n2 not in visited:
            q.append((n2, cnt + 1, ans + "S"))
            visited.add(n2)
        if n3 not in visited:
            q.append((n3, cnt + 1, ans + "L"))
            visited.add(n3)
        if n4 not in visited:
            q.append((n4, cnt + 1, ans + "R"))
            visited.add(n4)


for tc in range(int(input())):
    a, b = map(int, input().split())
    print(solve(a, b))
