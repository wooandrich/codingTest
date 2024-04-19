import sys


n, m = map(int, sys.stdin.readline().rstrip().split())

a = set(map(int, sys.stdin.readline().rstrip().split()))
b = set(map(int, sys.stdin.readline().rstrip().split()))

print(len(a-b) + len(b-a))










