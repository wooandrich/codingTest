import sys
import math


input = sys.stdin.readline

n = int(input())

prime = [True for i in range(n+1)]
prime[1] = False

for i in range(2, math.isqrt(n) + 1):
    if prime[i]:
        j = 2
        while i*j <= n:
            prime[i*j] = False
            j += 1
arr = []
for i in range(2,n+1):
    if prime[i]:
        arr.append(i)

prefix_sum = 0
end = 0
ans = 0

for start in range(len(arr)):
    while prefix_sum < n and end < len(arr):
        prefix_sum += arr[end]
        end += 1
    if prefix_sum == n:
        ans += 1
    prefix_sum -= arr[start]
print(ans)