import sys

n,m = map(int, sys.stdin.readline().rstrip().split())

arr = []
for _ in range(n):
    arr.append(list(map(int, sys.stdin.readline().rstrip().split())))
temp = [[0] * m for _ in range(n)] # 벽을 설치한 뒤의 맵 리스트

dx = [-1,0,1,0]
dy = [0,1,-0,-1]

ans = 0

# dfs 이용해 바이러스를 사방으로 퍼지게 하기
def virus(x,y):
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx >= 0 and nx < n and ny >= 0 and ny < m:
            if temp[nx][ny] == 0:
                # 해당위치에 바이러스 배치 후 재귀
                temp[nx][ny] = 2
                virus(nx,ny)

# 현재 맵에서 안전 영역의 크기를 계산하기 함수
def get_score():
    score = 0

    for i in range(n):
        for j in range(m):
            if temp[i][j] == 0:
                score += 1
    return score

def dfs(count):
    global ans
    # 울타리가 3개 설치된 경우
    if count == 3:
        for i in range(n):
            for j in range(m):
                temp[i][j] = arr[i][j]
        # 각 바이러스의 위치에서 전파 진행
        for i in range(n):
            for j in range(m):
                if temp[i][j] == 2:
                    virus(i,j)
        # 안전 영역의 최댓값 계산
        ans = max(ans, get_score())
        return
    # 빈 공간에 울타리 설치
    for i in range(n):
        for j in range(m):
            if arr[i][j] == 0:
                arr[i][j] = 1
                count += 1
                dfs(count)
                arr[i][j] = 0
                count -= 1



dfs(0)
print(ans)

