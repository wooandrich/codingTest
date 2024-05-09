import sys

a,b = map(int, sys.stdin.readline().rstrip().split())

def cal(num):
    if num == 0:
        return 0
    elif num == 1:
        return 1
    elif num % 2 == 0:
        return num // 2 + 2 * cal(num // 2)
    elif num % 2 == 1:
        return num // 2 + 2 * cal(num // 2) + 1



print(cal(b) - cal(a-1))