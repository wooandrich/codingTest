import sys
from collections import deque

n,k = map(int, sys.stdin.readline().rstrip().split())

# 시험관 초기화
arr = []

# 바이러스에 대한 정보를 담는 리스트
data = []

# 바이러스 입력
for i in range(n):
    arr.append(list(map(int, sys.stdin.readline().rstrip().split())))
    for j in range(n):
        # 해당 위치에 바이러스가 존재하는 경우
        if arr[i][j] != 0:
            # (바이러스 종류, 시간, 위치 x, 위치 y) 삽입
            data.append((arr[i][j], 0, i, j))

# 정렬 이후에 큐로 옮기기(낮은 번호의 바이러스가 먼저 증식하므로
data.sort()
q = deque(data)

# s초 뒤에 x,y 좌표
target_s,target_x,target_y = map(int, sys.stdin.readline().rstrip().split())

dx = [-1,1,0,0]
dy = [0,0,-1,1]

# bfs 진행
while q:
    virus, s, x, y = q.popleft()
    # 정확히 S초가 지나거나 큐가 빌 때까지 반복
    if s == target_s:
        break
    # 현재 노드에서 주변 4가지 위치를 각각 확인
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        
        # 해당 위치로 이동할 수 있는 경우
        if 0 <= nx < n and 0 <= ny < n:
            # 아직 방문하지 않은 위치라면 그 위치에 바이러스 넣기
            if arr[nx][ny] == 0:
                arr[nx][ny] = virus
                q.append((virus, s+1, nx,ny))
print(arr[target_x-1][target_y-1])

