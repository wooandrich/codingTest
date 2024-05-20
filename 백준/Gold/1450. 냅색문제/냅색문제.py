import sys
from itertools import combinations

input = sys.stdin.readline

n,c = map(int, input().split())

arr = list(map(int,input().split()))

length = len(arr)

a = arr[:length//2]
b = arr[length//2:]

a_sum = []
b_sum = []

for i in range(len(a)+1):
    temp = combinations(a,i)
    for j in temp:
        a_sum.append(sum(j))


for i in range(len(b)+1):
    temp = combinations(b,i)
    for j in temp:
        b_sum.append(sum(j))

a_sum.sort()
ans = 0

for element_b in b_sum:

    if element_b > c:
        continue

    start = 0
    end = len(a_sum) - 1

    while start <= end:
        mid = (start + end)  // 2

        if a_sum[mid] + element_b > c:
            end = mid - 1
        else:
            start = mid + 1
    ans += end + 1
print(ans)
















