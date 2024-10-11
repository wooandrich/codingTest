import sys

input = sys.stdin.readline

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
ans = 0

for a in range(1, 10):
    for b in range(1, 10):
        for c in range(1, 10):
            if a != b and a != c and b != c:
                cnt = 0
                for condi in arr:
                    num = condi[0]
                    strike = condi[1]
                    ball = condi[2]
                    s = 0
                    k = 0
                    p = num // 100
                    q = num % 100 // 10
                    r = num % 100 % 10
                    if a == p:
                        s += 1
                    elif a == q or a == r:
                        k += 1
                    if b == q:
                        s += 1
                    elif b == p or b == r:
                        k += 1
                    if c == r:
                        s += 1
                    elif c == p or c == q:
                        k += 1

                    if strike == s and ball == k:
                        cnt += 1
                    else:
                        break
                if cnt == n:
                    ans += 1
print(ans)

