import sys

input = sys.stdin.readline

def recur(number):
    if number == m:
        print(*arr)
        return

    for i in k:
        arr.append(i)
        recur(number + 1)
        arr.pop()

n,m = map(int, input().split())
k = sorted(list(map(int, input().split())))
arr = []

recur(0)

