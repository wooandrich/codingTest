import sys
from itertools import *

n,m = map(int, sys.stdin.readline().rstrip().split())

arr = []

data = map(int, sys.stdin.readline().rstrip().split())

for i in data:
    arr.append(i)

arr.sort()

arr2 = set(combinations_with_replacement(arr,m))

arr2 = sorted(list(arr2))

for i in arr2:
    k = list(i)
    print(" ".join(map(str, i)))