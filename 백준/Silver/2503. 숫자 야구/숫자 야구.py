import sys

input = sys.stdin.readline

n = int(input())

hint = [list(map(int, input().split())) for _ in range(n)]
ans = 0

for a in range(1,10):
    for b in range(1,10):
        for c in range(1,10):
            if a == b or b == c or a == c:
                continue
            cnt = 0
            for arr in hint:
                number = arr[0]
                strike = arr[1]
                ball = arr[2]

                strike_cnt = 0
                ball_cnt = 0

                if a == number // 100:
                    strike_cnt += 1
                elif str(a) in str(number):
                    ball_cnt += 1

                if b == number % 100 // 10:
                    strike_cnt += 1
                elif str(b) in str(number):
                    ball_cnt += 1

                if c == number % 100 % 10:
                    strike_cnt += 1
                elif str(c) in str(number):
                    ball_cnt += 1

                if strike == strike_cnt and ball == ball_cnt:
                    cnt += 1
            if cnt == n:
                ans += 1
print(ans)
