import sys

input = sys.stdin.readline

n,s = map(int,input().split())

arr = list(map(int, input().split()))

prefix_sum = 0
end = 0
ans = -1

for start in range(n):
    while prefix_sum < s and end < n:
        prefix_sum += arr[end]
        end += 1
    if prefix_sum < s:
        prefix_sum -= arr[start]
        continue
    if ans == -1:
        ans = end - start
    else:
        ans = min(ans, end - start)
    prefix_sum -= arr[start]
if ans == -1:
    print(0)
else:
    print(ans)