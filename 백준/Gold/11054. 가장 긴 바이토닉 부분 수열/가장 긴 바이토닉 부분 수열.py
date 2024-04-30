import sys

n = int(sys.stdin.readline().rstrip())

arr = list(map(int,sys.stdin.readline().rstrip().split()))
reverse_arr = arr[::-1]

dp = [1] * n
dp2 = [1] * n

for i in range(n):
    for j in range(i):
        if arr[i] > arr[j]:
            dp[i] = max(dp[i], dp[j] + 1)
        if reverse_arr[i] > reverse_arr[j]:
            dp2[i] = max(dp2[i], dp2[j] + 1)

ans = [0] * n

for i in range(n):
    ans[i] = dp[i] + dp2[n-i-1] - 1
print(max(ans))



