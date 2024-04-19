import sys

input = sys.stdin.readline


n = int(input())

if n == 1:
    print()
else:
    now = 2
    end = int(n**(1/2))

    while now <= end:
        if n % now != 0:
            now += 1
        else:
            print(now)
            n //= now
    if n > 1:
        print(n)