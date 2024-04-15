n = int(input())

arr = [[0] * 3 for _ in range(n)]


for i in range(n):
    r,g,b = map(int, input().split())

    arr[i][0] = r
    arr[i][1] = g
    arr[i][2] = b

for i in range(1,n):
    arr[i][0] = min(arr[i-1][1], arr[i-1][2]) + arr[i][0]
    arr[i][1] = min(arr[i-1][0], arr[i-1][2]) + arr[i][1]
    arr[i][2] = min(arr[i-1][0], arr[i-1][1]) + arr[i][2]

print(min(arr[n-1][0], arr[n-1][1], arr[n-1][2]))

