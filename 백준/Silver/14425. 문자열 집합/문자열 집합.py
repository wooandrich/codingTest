import sys


n, m = map(int, sys.stdin.readline().rstrip().split())


a = []
b = []
ans = 0

for _ in range(n):
    a.append(sys.stdin.readline().rstrip())

for _ in range(m):
    b.append(sys.stdin.readline().rstrip())

for s in b:
    if s in a:
        ans += 1
print(ans)












