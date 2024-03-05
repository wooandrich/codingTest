import sys

n = int(sys.stdin.readline().rstrip())
man = list(map(int, sys.stdin.readline().rstrip().split()))
man.sort()
ans = 0
cnt = 0
for time in man:
    cnt += time
    ans += cnt
print(ans)

