import sys

n = int(sys.stdin.readline().rstrip())

arr = list(map(int, sys.stdin.readline().rstrip().split()))

arr.sort()

print(arr[(n-1) // 2])
