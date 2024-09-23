import sys

sys.setrecursionlimit(100000)

input = sys.stdin.readline

def recur(idx, price):
    global ans

    if idx == n:
        ans = max(ans, price)
        return
    if idx + interview[idx][0] <= n:
        recur(idx + interview[idx][0], price + interview[idx][1])
    recur(idx + 1, price)


n = int(input())

interview = [list(map(int, input().split())) for _ in range(n)]

ans = 0

recur(0,0)

print(ans)