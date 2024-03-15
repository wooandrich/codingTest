import sys
from itertools import *

n,m = map(int, sys.stdin.readline().rstrip().split())

arr = []

data = map(int, sys.stdin.readline().rstrip().split())

for i in data:
    arr.append(i)

arr.sort()

arr2 = list(combinations_with_replacement(arr,m))

for i in arr2:
    k = list(i)
    print(" ".join(map(str, i)))