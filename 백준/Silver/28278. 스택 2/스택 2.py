import sys

stack = []
for tc in range(int(sys.stdin.readline().rstrip())):
    order = list(sys.stdin.readline().rstrip().split())
    
    if int(order[0]) == 1:
        stack.append(int(order[1]))
    elif int(order[0]) == 2:
        if len(stack) == 0:
            print(-1)
        else:
            num = stack.pop()
            print(num)
    elif int(order[0]) == 3:
        print(len(stack))
    elif int(order[0]) == 4:
        if len(stack) == 0:
            print(1)
        else:
            print(0)
    elif int(order[0]) == 5:
        if len(stack) == 0:
            print(-1)
        else:
            print(stack[-1])























