import sys
import bisect

n = int(sys.stdin.readline().rstrip())
arr = list(map(int,sys.stdin.readline().rstrip().split()))

dp = [arr[0]]

for i in range(1,n):
    if arr[i] > dp[-1]:
        dp.append(arr[i])
    else:
        idx = bisect.bisect_left(dp,arr[i])
        dp[idx] = arr[i]
print(len(dp))