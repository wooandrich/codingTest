import sys
import heapq

for tc in range(int(sys.stdin.readline().rstrip())):
    k = int(sys.stdin.readline().rstrip())

    arr = list(map(int,sys.stdin.readline().rstrip().split()))

    dp = [[0 for _ in range(k)]for _ in range(k)]


    subSum = {-1 : 0}
    for idx in range(k):
        subSum[idx] = subSum[idx - 1] + arr[idx]

    for size in range(1,k):
        for start in range(k-1):
            end = start + size

            if end >= len(arr):
                break

            result = int(1e9)

            for cut in range(start,end):
                result = min(result, dp[start][cut] + dp[cut+1][end] + subSum[end] - subSum[start - 1])
            dp[start][end] = result
    print(dp[0][-1])


