import sys
from itertools import *

n,m = map(int, sys.stdin.readline().rstrip().split())

arr = []

for i in range(1, n+1):
    arr.append(i)

ans = list(combinations_with_replacement(arr,m))

for a in ans:
    data = list(a)
    print(" ".join(map(str, data)))