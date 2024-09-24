import sys
from itertools import permutations


input = sys.stdin.readline

def sol(temp):
    result = 0
    for i in range(len(temp) - 1):
        result += abs(temp[i] - temp[i+1])
    return result

n = int(input())

arr = list(map(int, input().split()))

permu = permutations(arr, n)
ans = 0

for temp in permu:
    ans = max(ans, sol(temp))
print(ans)


