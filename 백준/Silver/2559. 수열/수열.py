import sys

n,k = map(int, sys.stdin.readline().rstrip().split())
arr = list(map(int, sys.stdin.readline().rstrip().split()))

prefix_sum = [0] * n

prefix_sum[0] = arr[0]

for i in range(1,n):
    prefix_sum[i] = prefix_sum[i-1] + arr[i]

ans = []

for i in range(k-1,n):
    if i == k-1:
        ans.append(prefix_sum[i])
    else:
        ans.append(prefix_sum[i] - prefix_sum[i-k])
print(max(ans))

