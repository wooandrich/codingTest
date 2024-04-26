import sys
import math

arr = dict()
array = []
sum_val = 0

n = int(sys.stdin.readline().rstrip())

for _ in range(n):
    key = int(sys.stdin.readline().rstrip())
    array.append(key)
    sum_val += key
    if key in arr:
        arr[key] += 1
    else:
        arr[key] = 1
array.sort()
print(round(sum_val / n))
print(array[n//2])
many_val = 0

for i in arr:
    many_val = max(many_val, arr[i])
k = []

for i in arr:
    if arr[i] == many_val:
        k.append(i)
k.sort()
if len(k) == 1:
    print(k[0])
else:
    print(k[1])
if len(array) == 1:
    print(0)
else:
    print(array[-1] - array[0])

