import sys

n = int(sys.stdin.readline())

arr = []

# 삼각형 입력
for _ in range(n):
    arr.append(list(map(int, sys.stdin.readline().split())))

# 바텀업 dp 리스트
d = [[0] * i for i in range(1,n+1)]

d[0][0] = arr[0][0]

# 2번째 줄부터 n번째 줄까지 바텀업
for i in range(1,n):
    for j in range(i+1):
        # 제일 왼쪽일때
        if j == 0:
            d[i][j] = arr[i][j] + d[i-1][j]
        # 제일 오른쪽일때
        elif j == i:
            d[i][j] = arr[i][j] + d[i-1][j-1]
        # 중간 일때
        else:
            d[i][j] = arr[i][j] + max(d[i-1][j-1], d[i-1][j])

result = 0

for i in range(n):
    result = max(d[n-1][i], result)

print(result)