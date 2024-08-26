import sys

input = sys.stdin.readline

n = int(input())

arr = []

for i in range(2, int(n ** 0.5) + 1):
    while n % i == 0:
        arr.append(i)
        n //= i
if n != 1:
    arr.append(n)
print(len(arr))
arr.sort()
print(*arr)