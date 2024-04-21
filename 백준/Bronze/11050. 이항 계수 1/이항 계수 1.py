import sys
from itertools import combinations

n,k = map(int, sys.stdin.readline().rstrip().split())

arr = [i for i in range(n)]

print(len(list(combinations(arr,k))))











