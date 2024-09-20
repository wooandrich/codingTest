import sys

input = sys.stdin.readline

def recur(number):
    if number == m:
        print(*arr)
        return

    for i in range(1,n+1):
        if i in arr:
            continue
        if len(arr) > 0:
            temp = arr[-1]
            if i < temp:
                continue

        arr.append(i)
        recur(number + 1)
        arr.pop()

n,m = map(int, input().split())
arr = []

recur(0)

