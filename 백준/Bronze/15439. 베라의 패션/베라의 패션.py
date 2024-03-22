import itertools
from itertools import *

n = int(input())
arr = [i for i in range(1, n+1)]

arr_2 = list(itertools.permutations(arr,2))

print(len(arr_2))