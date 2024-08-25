import sys

input = sys.stdin.readline

n = int(input())

ans = 0

for a in range(n+1):
    for b in range(n+1):
        for c in range(n+1):
            if a + b + c == n:
                if a >= b + 2:
                    if a > 0 and b > 0 and c > 0:
                        if c % 2 == 0:
                            ans += 1
print(ans)