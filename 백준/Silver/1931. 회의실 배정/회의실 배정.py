import sys

n = int(sys.stdin.readline().rstrip())
arr = []
for i in range(n):
    arr.append(list(map(int, sys.stdin.readline().rstrip().split())))
arr.sort(key=lambda x:(x[1], x[0]))
ans = 0
endPoint = 0
for start, end in arr:
    if start >= endPoint:
        endPoint = end
        ans += 1
print(ans)


