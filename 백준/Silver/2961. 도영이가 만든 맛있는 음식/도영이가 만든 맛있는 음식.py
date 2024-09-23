import sys

sys.setrecursionlimit(100000)

input = sys.stdin.readline

def recur(idx, sin, ssen,use):
    global answer

    if idx == n:
        if use == 0:
            return
        result = abs(sin - ssen)
        answer = min(answer, result)
        return
    recur(idx+1, sin * ingre[idx][0], ssen + ingre[idx][1], use + 1)

    recur(idx+1, sin, ssen, use)


n = int(input())

ingre = [list(map(int, input().split())) for _ in range(n)]
answer = int(1e9)

recur(0,1,0,0)

print(answer)
