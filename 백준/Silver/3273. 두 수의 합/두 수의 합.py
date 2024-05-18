import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
x = int(input())

arr.sort()
prefix_sum = 0
start = 0
end = n-1
ans = 0

while start < end:
    temp = arr[start] + arr[end]
    if temp == x:
        ans += 1
        start += 1
    elif temp < x:
        start += 1
    else:
        end -= 1
print(ans)


