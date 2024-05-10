import sys

n = int(sys.stdin.readline().rstrip())

arr = list(map(int,sys.stdin.readline().rstrip().split()))

NGE = [-1] * n

stack = [0]

for i in range(1,n):
    while stack and arr[stack[-1]] < arr[i]:
        NGE[stack.pop()] = arr[i]
    stack.append(i)
print(*NGE)

