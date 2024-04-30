import sys

n,m = map(int,sys.stdin.readline().rstrip().split())

arr = [list(map(int,sys.stdin.readline().rstrip().split())) for _ in range(n)]

prefix_sum = [[0] * (n+1) for _ in range(n+1)]

for i in range(1,n+1):
    for j in range(1,n+1):
        prefix_sum[i][j] = prefix_sum[i][j-1] + prefix_sum[i-1][j] - prefix_sum[i-1][j-1] + arr[i-1][j-1]


for tc in range(m):
    x1,y1,x2,y2 = map(int,sys.stdin.readline().rstrip().split())

    result = prefix_sum[x2][y2] - prefix_sum[x2][y1-1] - prefix_sum[x1-1][y2] + prefix_sum[x1-1][y1-1]
    print(result)