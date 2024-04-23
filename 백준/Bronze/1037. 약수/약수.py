import sys

n = int(sys.stdin.readline().rstrip())

arr = list(map(int, sys.stdin.readline().rstrip().split()))

if n == 1:
    print(arr[0] ** 2)
else:
    arr.sort()
    print(arr[0] * arr[-1 ])