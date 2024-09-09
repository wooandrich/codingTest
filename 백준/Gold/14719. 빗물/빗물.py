import sys

input = sys.stdin.readline

h,w = map(int,input().split())

arr = list(map(int,input().split()))

ans = 0

for i in range(1, w - 1):
    left_val = max(arr[:i])
    right_val = max(arr[i+1:])

    temp = min(left_val, right_val)

    if arr[i] < temp:
        ans += temp - arr[i]
print(ans)