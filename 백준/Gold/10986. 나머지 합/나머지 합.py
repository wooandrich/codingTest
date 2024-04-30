import sys

n,m = map(int, sys.stdin.readline().rstrip().split())

arr = list(map(int,sys.stdin.readline().rstrip().split()))

prefix_sum = 0

r = [0] * m


for i in range(n):
    prefix_sum += arr[i]
    r[prefix_sum % m] += 1

ans = r[0]

for i in range(m):
    ans += r[i] * (r[i] - 1) // 2
print(ans)


