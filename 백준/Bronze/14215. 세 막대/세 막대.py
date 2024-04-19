import sys

input = sys.stdin.readline


arr = list(map(int, input().split()))

arr.sort()

if arr[2] < arr[0] + arr[1]:
    print(sum(arr))
else:
    arr[2] = arr[0] + arr[1] -1
    print(sum(arr))

