import sys
sys.setrecursionlimit(1000000)

def dfs(t):
    global cnt
    visited[t] = cnt
    arr[t].sort()
    for i in arr[t]:
        if visited[i] == 0:
            cnt += 1
            dfs(i)


# 정점의 수, 간선의 수, 시작정점
n, m, r = map(int, sys.stdin.readline().rstrip().split())

arr = [[] for _ in range(n + 1)]

visited = [0] * (n + 1)  # 저장값

cnt = 1

for _ in range(m):
    x, y = map(int, sys.stdin.readline().rstrip().split())
    arr[x].append(y)
    arr[y].append(x)

dfs(r)

for j in range(1, n + 1):
    print(visited[j])
