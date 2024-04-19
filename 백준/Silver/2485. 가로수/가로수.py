import sys
import math

n = int(sys.stdin.readline().rstrip())

arr = []

diff = []


for _ in range(n):
    arr.append(int(sys.stdin.readline().rstrip()))

for i in range(n-1):
    diff.append(arr[i+1] - arr[i])

k = diff[0]
for i in range(1, len(diff)):
    k = math.gcd(k, diff[i])

ans = 0

for num in diff:
    ans += num // k - 1
print(ans)











