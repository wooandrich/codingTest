import sys
from collections import deque

input = sys.stdin.readline

def left(idx, d):
    if idx < 0:
        return
    if arr[idx][2] != arr[idx + 1][6]:
        left(idx - 1, -d)
        arr[idx].rotate(d)
def right(idx, d):
    if idx > 3:
        return
    if arr[idx - 1][2] != arr[idx][6]:
        right(idx + 1, -d)
        arr[idx].rotate(d)

arr = [deque(list(map(int, input().strip()))) for _ in range(4)]

n = int(input())

for i in range(n):
    idx, d = map(int, input().split())
    idx -= 1

    left(idx - 1, -d)

    right(idx + 1, -d)

    arr[idx].rotate(d)

ans = 0
for i in range(4):
    if arr[i][0] == 1:
        ans += 2 ** i
print(ans)