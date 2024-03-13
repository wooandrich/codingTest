import sys

n = int(sys.stdin.readline().rstrip())

data = list(map(int, sys.stdin.readline().rstrip().split()))

add, sub, mul, div = map(int, sys.stdin.readline().rstrip().split())

max_ans = int(-1e9)
min_ans = int(1e9)

def dfs(i, now):
    global min_ans, max_ans, add,sub,mul,div

    # 모든 연산자를 다 사용한경우, 최솟값과 최댓값 업데이트
    if i == n:
        min_ans = min(min_ans, now)
        max_ans = max(max_ans, now)

    else:
        # 각 연산자에 대하여 재귀적으로 수행
        if add > 0:
            add -= 1
            dfs(i+1, now + data[i])
            add += 1
        if sub > 0:
            sub -= 1
            dfs(i+1, now - data[i])
            sub += 1
        if mul > 0:
            mul -= 1
            dfs(i+1, now * data[i])
            mul += 1
        if div > 0:
            div -= 1
            dfs(i+1, int(now / data[i]))
            div += 1

dfs(1, data[0])

print(max_ans)
print(min_ans)