import sys
import math

input = sys.stdin.readline

n = int(input())

arr = list(map(int, input().split()))
arr.sort()
ans = 0

for i in range(len(arr) - 1):
    if math.gcd(arr[i], arr[i + 1]) != 1:
        for j in range(arr[i], arr[i + 1]):
            if math.gcd(arr[i], j) == 1:
                if math.gcd(arr[i + 1], j) == 1:
                    ans += 1
                    break
        else:
            ans += 2
print(ans)