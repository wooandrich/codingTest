import sys

input = sys.stdin.readline

n = int(input())

arr = sorted(list(map(int, input().split())))

target = int(input())

start = 0
end = n-1

ans = 0

while start < end:
    if arr[start] + arr[end] == target:
        ans += 1
        end -= 1
    elif arr[start] + arr[end] < target:
        start += 1
    else:
        end -= 1
print(ans)