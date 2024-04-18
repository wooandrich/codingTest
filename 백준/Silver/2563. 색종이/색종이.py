n = int(input())

ans = 0

arr = [[0] * 101 for i in range(101)]

for _ in range(n):
    y,x = map(int, input().split())

    for i in range(x, x+10):
        for j in range(y, y+10):
            arr[i][j] += 1

for i in range(101):
    for j in range(101):
        if arr[i][j] != 0:
            ans += 1
print(ans)