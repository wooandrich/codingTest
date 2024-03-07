import sys

ans = 0
size = 1

# 오른쪽 90도 기준으로 동 남 서 북
dx = [0,1,0,-1]
dy = [1,0,-1,0]

# 뱀이 움직인 순서, 0번째가 꼬리
remember = []

# 보드의 크기
n = int(sys.stdin.readline().rstrip())

# 보드 생성
arr = [[0] * n for _ in range(n)]

# 사과 개수
k = int(sys.stdin.readline().rstrip())

# 사과 위치
for _ in range(k):
    x, y = map(int, sys.stdin.readline().rstrip().split())
    arr[x-1][y-1] = "a"

# 뱀 머리
head_x,head_y = 0,0

remember.append([head_x, head_y])

# 뱀 이동방향 저장
l = int(sys.stdin.readline().rstrip())

rotate = []

for _ in range(l):
    rotate.append(sys.stdin.readline().rstrip().split())

# 뱀 최초위치
arr[head_x][head_y] = 1

# 이동시작

rotate_start = 0
rotate_time = int(rotate[0][0])
rotate_side = rotate[0][1]

while True:
    # 1초가 지나면 뱀 움직임
    ans += 1

    # 몸집도 커짐
    size += 1

    head_x = head_x + dx[rotate_start]
    head_y = head_y + dy[rotate_start]


    # 벽에 부딪힐 경우
    if head_x < 0 or head_x >= n or head_y < 0 or head_y >= n:
        break
    # 자기 자신과 부딪힐 경우
    if size > 1 and arr[head_x][head_y] == 1:
        break

    remember.append([head_x, head_y])


    # 사과가 있을 시
    if arr[head_x][head_y] == "a":
        arr[head_x][head_y] = 1
    else:
        # 사과가 없을 시
        size -= 1
        arr[head_x][head_y] = 1
        arr[remember[0][0]][remember[0][1]] = 0
        remember.pop(0)

    # 움직일 시간이 되었다면
    if ans == rotate_time:
        if rotate_side == "D": # 오른쪽으로 회전
            rotate_start = (rotate_start + 1) % 4
        else: # 왼쪽으로 회전
            rotate_start = (rotate_start - 1) % 4

        rotate.pop(0)
        # 새로운 시간과 방향 설정
        if len(rotate) > 0:
            rotate_time = int(rotate[0][0])
            rotate_side = rotate[0][1]
print(ans)


