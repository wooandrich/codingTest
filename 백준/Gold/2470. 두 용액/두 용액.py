import sys

input = sys.stdin.readline

n = int(input())
arr = sorted(list(map(int, input().split())))


start, end = 0, n-1
left, right = arr[start], arr[end]
ans = arr[start] + arr[end]
while start < end:
    temp = arr[start] + arr[end]
    if temp == 0:
        left = arr[start]
        right = arr[end]
        break
    else:
        if abs(temp - 0) < abs(ans - 0):
            left = arr[start]
            right = arr[end]
            ans = temp
        if arr[end] + arr[start] < 0:
            start += 1
        else:
            end -= 1
print(left, right)