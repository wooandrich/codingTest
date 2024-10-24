from collections import deque
import sys

input = sys.stdin.readline

def init():
    q = deque()
    for i in range(n):
        for j in range(m):
            if graph[i][j] != 6 and graph[i][j] != 0:
                q.append((graph[i][j], i, j))
    return q

def check(row,col):
    return row < 0 or row >= n or col < 0 or col >= m

def zero_cnt(graph_copy):
    global ans
    cnt = 0
    for i in graph_copy:
        cnt += i.count(0)
    ans = min(ans, cnt)

def move(x,y,dir, graph_copy):
    for d in dir:
        nx, ny = x,y

        while 1:
            nx += dx[d]
            ny += dy[d]
            if check(nx,ny) or graph_copy[nx][ny] == 6:
                break
            if graph_copy[nx][ny] != 0:
                continue
            graph_copy[nx][ny] = '#'

def dfs(cnt, graph):
    graph_copy = [[j for j in graph[i]] for i in range(n)]

    if cnt == len(cctv):
        zero_cnt(graph_copy)
        return

    num, x,y = cctv[cnt]

    for d in direction[num]:
        move(x,y,d, graph_copy)
        dfs(cnt + 1, graph_copy)
        graph_copy = [[j for j in graph[i]] for i in range(n)]


n,m = map(int, input().split())

graph = [list(map(int, input().split())) for _ in range(n)]

dx = [1,0,-1,0]
dy = [0,1,0,-1]

direction = {
    1 : [[0], [1], [2], [3]],
    2 : [[0,2], [1,3]],
    3 : [[0,1],[1,2],[2,3],[3,0]],
    4 : [[0,1,2], [1,2,3], [2,3,0], [3,0,1]],
    5 : [[0,1,2,3]]

}

cctv = init()

ans = 1e9

dfs(0, graph)



print(ans)
