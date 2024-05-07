import sys

n = int(sys.stdin.readline().rstrip())
k = int(sys.stdin.readline().rstrip())

start = 1
end = k
ans = 0
while start<=end:
    temp = 0

    mid = (start+end) // 2

    for i in range(1,n+1):
        temp += min(mid//i, n)

    if temp >= k:
        ans = mid
        end = mid - 1
    else:
        start = mid + 1

print(ans)


