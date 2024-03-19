import sys

n,m = map(int, sys.stdin.readline().rstrip().split())
arr = list(map(int, sys.stdin.readline().rstrip().split()))

arr.sort()


start = 0
end = arr[-1]

while start <= end:
    ans = 0
    mid = (start + end) // 2

    for i in arr:
        if mid < i:
            ans += i - mid
    if ans >= m:
        start = mid + 1
    else:
        end = mid - 1
print(end)


