import sys

input = sys.stdin.readline


n = int(input())

if n == 1:
    print()
else:
    result = []
    now = 2

    while now <= n:
        if n % now == 0:
            result.append(now)
            n //= now
        else:
            now += 1
    for num in result:
        print(num)