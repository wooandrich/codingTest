import sys

while 1:
    s = sys.stdin.readline().rstrip()
    if s[0] == '.' and len(s) == 1:
        break
    stack = []

    sign = True

    for a in s:
        if a == '(':
            stack.append(a)
        elif a == '[':
            stack.append(a)
        elif a == ')':
            if len(stack) > 0:
                if stack[-1] == "(":
                    stack.pop()
                else:
                    sign = False
                    break
            else:
                sign = False
                break
        elif a == ']':
            if len(stack) > 0:
                if stack[-1] == "[":
                    stack.pop()
                else:
                    sign = False
                    break
            else:
                sign = False
                break

    if sign and len(stack) == 0:
        print('yes')
    else:
        print('no')


























