import sys

sys.setrecursionlimit(100000)

input = sys.stdin.readline

def recur(idx, a, b,c,d,e):
    global answer
    global used
    global answer_used

    if a >= p and b >= q and c >= r and d >= s:
            if answer > e:
                answer = min(answer, e)
                answer_used = []
                for i in used:
                    answer_used.append(i)


    if idx == n:
        return

    used.append(idx+1)

    recur(idx+1, a + ingre[idx][0], b + ingre[idx][1], c + ingre[idx][2], d + ingre[idx][3],e + ingre[idx][4])
    used.pop()

    recur(idx+1, a, b, c,d,e)

n = int(input())

p,q,r,s = map(int, input().split())
ingre = [list(map(int, input().split())) for _ in range(n)]
answer = int(1e9)
used = []
answer_used = []

recur(0,0,0,0,0,0)

answer_used.sort()

if answer_used:
    print(answer)
    print(*answer_used)
else:
    print(-1)