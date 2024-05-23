import sys


input = sys.stdin.readline

arr = []

for i in range(1,9):
    score = int(input())
    arr.append((score,i))
arr.sort(reverse=True)

ans = 0
result = []

for a,b in arr[:5]:
    ans += a
    result.append(b)
print(ans)
result.sort()
print(*result)



