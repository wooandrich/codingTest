import sys

n = int(sys.stdin.readline().rstrip())

arr = [list(map(int, sys.stdin.readline().rstrip().split())) for _ in range(n)]

res = int(1e9)

check = [False for _ in range(n)]

def dfs(l, idx):
    global res
    if l == n // 2:
        a = 0
        b = 0
        for i in range(n):
            for j in range(n):
                if check[i] and check[j]:
                    a += arr[i][j]
                elif not check[i] and not check[j]:
                    b += arr[i][j]
        res = min(res, abs(a-b))
        return
    for i in range(idx, n):
        if not check[i]:
            check[i] = True
            dfs(l+1, i + 1)
            check[i] = False


dfs(0,0)
print(res)