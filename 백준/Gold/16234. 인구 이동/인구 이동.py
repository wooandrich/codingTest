import sys
from collections import deque

n, l, r = map(int, sys.stdin.readline().rstrip().split())

# 국경
board = []

# 인구수 입력
for _ in range(n):
    board.append(list(map(int, sys.stdin.readline().rstrip().split())))

# 답 인구이동 횟수
ans = 0

# dx, dy
dx = [-1,1,0,0]
dy = [0,0,-1,1]

def dfs(x,y,index):
    united = []
    united.append((x,y))
    # bfs
    q = deque()
    q.append((x,y))
    check[x][y] = index # 연합의 번호 할당
    summary = board[x][y] # 현재 연합의 전체 인구수
    count = 1 # 현재 연합의 국가 수

    while q:
        x, y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < n and 0 <= ny < n and check[nx][ny] == -1:
                if l <= abs(board[x][y] - board[nx][ny]) <= r:
                    q.append((nx,ny))
                    # 연합에 추가
                    check[nx][ny] = index
                    summary += board[nx][ny]
                    count += 1
                    united.append((nx,ny))

    # 연합 국가 끼리 인구를 분배
    for i,j in united:
        board[i][j] = summary // count
    



# 인구이동 시작
while True:
    # 국경선을 여는 기준
    check = [[-1] * n for _ in range(n)]

    index = 0

    # 연합 만들기
    for i in range(n):
        for j in range(n):
            if check[i][j] == -1: # 해당 나라가 처리되지않았다면:
                dfs(i,j,index)
                index += 1
    # 모든 인구 이동이 끝나면 dfs 함수로 안 갔을때
    if index == n * n:
        break
    ans += 1

print(ans)