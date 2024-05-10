import sys

stack = []

data = sys.stdin.readline().rstrip()
boom = sys.stdin.readline().rstrip()

def find(stack):
    length = len(boom)
    sign = True

    if len(stack) < length:
        return False
    else:
        for i in range(len(boom)):
            if stack[-1-i] != boom[-1-i]:
                sign = False
        if sign:
            return True
        else:
            return False


for a in data:
    stack.append(a)

    if a == boom[-1]:
        if find(stack):
            for i in range(len(boom)):
                stack.pop()
if len(stack) == 0:
    print("FRULA")
else:
    print(''.join(stack))