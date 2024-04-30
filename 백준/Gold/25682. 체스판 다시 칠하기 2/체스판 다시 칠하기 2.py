import sys

n,m,k = map(int, sys.stdin.readline().rstrip().split())

arr = [sys.stdin.readline().rstrip() for _ in range(n)]

b_prefix = [[0 for _ in range(m+1)] for _ in range(n+1)]
w_prefix = [[0 for _ in range(m+1)] for _ in range(n+1)]

for i in range(n):
    for j in range(m):
        if (i+j) % 2:
            if arr[i][j] == "B":
                b_prefix[i][j] = 1 + b_prefix[i-1][j] + b_prefix[i][j-1] - b_prefix[i-1][j-1]
                w_prefix[i][j] = 0 + w_prefix[i-1][j] + w_prefix[i][j-1] - w_prefix[i-1][j-1]
            else:
                b_prefix[i][j] = 0 + b_prefix[i - 1][j] + b_prefix[i][j - 1] - b_prefix[i - 1][j - 1]
                w_prefix[i][j] = 1 + w_prefix[i - 1][j] + w_prefix[i][j - 1] - w_prefix[i - 1][j - 1]
        else:
            if arr[i][j] == "B":
                b_prefix[i][j] = 0 + b_prefix[i-1][j] + b_prefix[i][j-1] - b_prefix[i-1][j-1]
                w_prefix[i][j] = 1 + w_prefix[i-1][j] + w_prefix[i][j-1] - w_prefix[i-1][j-1]
            else:
                b_prefix[i][j] = 1 + b_prefix[i - 1][j] + b_prefix[i][j - 1] - b_prefix[i - 1][j - 1]
                w_prefix[i][j] = 0 + w_prefix[i - 1][j] + w_prefix[i][j - 1] - w_prefix[i - 1][j - 1]
ans = int(1e9)

for i in range(n-k+1):
    for j in range(m-k+1):
        b_sum = b_prefix[i+k-1][j+k-1] - b_prefix[i-1][j+k-1] - b_prefix[i+k-1][j-1] + b_prefix[i-1][j-1]
        w_sum = w_prefix[i+k-1][j+k-1] - w_prefix[i-1][j+k-1] - w_prefix[i+k-1][j-1] + w_prefix[i-1][j-1]
        ans = min(ans,b_sum,w_sum)
print(ans)
