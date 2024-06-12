import sys
import bisect

input = sys.stdin.readline


n,m = map(int,input().split())
arr = list(map(int,input().split()))

prefix_sum = [arr[0]]

for i in range(1,m):
    sum_val = prefix_sum[i-1] + arr[i]
    prefix_sum.append(sum_val)

for _ in range(n):
    candy = int(input())
    if candy > prefix_sum[-1]:
        print("Go away!")
    else:
        print(bisect.bisect_left(prefix_sum,candy) + 1)
