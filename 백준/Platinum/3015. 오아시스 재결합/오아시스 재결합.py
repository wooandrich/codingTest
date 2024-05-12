import sys


n = int(sys.stdin.readline().rstrip())

arr = [int(sys.stdin.readline().rstrip()) for _ in range(n)]

ans = 0

stack = []

for human in arr:
    if not stack or human < stack[-1][0]:
        stack.append([human, 1])
    elif human == stack[-1][0]:
        ans += stack[-1][1]
        stack[-1][1] += 1
    else:
        while stack and human > stack[-1][0]:
            ans += stack.pop()[-1]

        if stack and human == stack[-1][0]:
            ans += stack[-1][1]
            stack[-1][1] += 1
        else:
            stack.append([human, 1])
    if len(stack) > 1:
        ans += 1
print(ans)

