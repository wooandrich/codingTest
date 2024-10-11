import sys

input = sys.stdin.readline

n = int(input())

ans = 0

for i in range(0,n+1):
    for j in range(0,n+1):
        for k in range(0,n+1):
            if i + j + k == n:
                if k >= j + 2:
                    if i % 2 == 0:
                        if i > 0 and j > 0 and k > 0:
                            ans += 1
print(ans)
