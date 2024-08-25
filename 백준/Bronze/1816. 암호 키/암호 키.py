import sys

input = sys.stdin.readline

def solve(n):
    for i in range(2, 1000001):
        if n % i == 0:
            return False
    return True

s = int(input())

for _ in range(s):
    n = int(input())

    if (solve(n)):
        print("YES")
    else:
        print("NO")