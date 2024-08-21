import sys
from collections import deque
dx = [-1,1,0,0]
dy = [0,0,-1,0]

def search():
    temp = deque()
    visited = [[False] * n for _ in range(n)]
    temp.append((s_x, s_y, 0))
    visited[s_x][s_y] = True
    fish = []

    while temp:
        x,y,dist = temp.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < n and 0 <= ny < n and not visited[nx][ny]:
                if arr[nx][ny] <= size:
                    visited[nx][ny] = True
                    temp.append((nx,ny,dist + 1))
                    if 0 < arr[nx][ny] < size:
                        fish.append((nx,ny,dist + 1))

    return fish

input = sys.stdin.readline

dx = [-1,1,0,0]
dy = [0,0,-1,1]

n = int(input())

arr = [list(map(int, input().split())) for _ in range(n)]
s_x, s_y = 0, 0
# 초기 상어 위치 찾기
for i in range(n):
    flag = False
    for j in range(n):
        if arr[i][j] == 9:
            s_x = i
            s_y = j
            arr[i][j] = 0
            flag = True
            break
    if flag:
        break
size = 2
cnt = 0

ans = 0

while 1:
    temp = search()
    if len(temp) == 0:
        break
    temp.sort(key =lambda i: (i[2], i[0], i[1]))

    cnt += 1
    if cnt == size:
        size += 1
        cnt = 0
    ans += temp[0][2]
    arr[temp[0][0]][temp[0][1]] = 0

    s_x, s_y = temp[0][0], temp[0][1]




print(ans)
