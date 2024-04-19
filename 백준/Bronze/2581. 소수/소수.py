import sys

input = sys.stdin.readline

n = int(input())
m = int(input())

arr = [i for i in range(n,m+1)]

ans = []

for num in arr:
    if num == 1:
        continue
    end = int(num ** (1/2))
    prime = True
    for i in range(2, end+1):
        if num % i == 0:
            prime = False
            break
    if prime:
        ans.append(num)
if len(ans) == 0:
    print(-1)
else:
    print(sum(ans))
    print(min(ans))