import sys

input = sys.stdin.readline

n = int(input())

arr = [0 for i in range(1001)]

big_index = 0
last_index = 0

for i in range(n):
    a,b = map(int, input().split())
    arr[a] = b

    if arr[big_index] < b:
        big_index = a
    last_index = max(last_index, a)

ans = 0

now_val = arr[1]
for i in range(1, big_index):
    if arr[i] > now_val:
        ans += arr[i]
        now_val = arr[i]
    else:
        ans += now_val

now_val = arr[last_index]
for i in range(last_index, big_index, -1):
    if arr[i] > now_val:
        ans += arr[i]
        now_val = arr[i]
    else:
        ans += now_val

ans += arr[big_index]

print(ans)