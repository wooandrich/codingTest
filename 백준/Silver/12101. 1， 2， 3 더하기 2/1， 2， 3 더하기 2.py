import sys

input = sys.stdin.readline

def dfs(sum_cnt, ans):
    global cnt
    if sum_cnt > n:
        return
    if n == sum_cnt:
        cnt += 1
        if cnt == k:
            print(ans[:-1])
            exit()
    for i in (1,2,3):
        dfs(sum_cnt + i, ans + str(i) + '+')

n,k = map(int, input().split())
cnt = 0
dfs(0, "")
print(-1)









