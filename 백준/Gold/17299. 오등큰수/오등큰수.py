import sys
from collections import Counter

n = int(sys.stdin.readline().rstrip())

arr = list(map(int, sys.stdin.readline().rstrip().split()))


dic = Counter(arr)


stack = [0]

ans = [-1] * n

for i in range(1,n):
    while stack and dic[arr[stack[-1]]] < dic[arr[i]]:
        ans[stack.pop()] = arr[i]
    stack.append(i)
print(' '.join(map(str,ans)))

