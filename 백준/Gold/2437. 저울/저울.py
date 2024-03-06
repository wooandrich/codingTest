import sys

n = sys.stdin.readline().rstrip()
arr = list(map(int, sys.stdin.readline().rstrip().split()))
arr.sort()

ans = 1

for i in arr:
    if ans < i:
        break
    ans += i

print(ans)
