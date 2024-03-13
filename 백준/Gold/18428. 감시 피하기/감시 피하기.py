import sys
from itertools import combinations


n = int(sys.stdin.readline().rstrip())

# 복도 정보
arr = []

# 모든 선생님 위치정보
teachers = []

# 모든 빈 공간 위치 정보
spaces = []


for i in range(n):
    arr.append(list(sys.stdin.readline().rstrip().split()))
    for j in range(n):
        # 선생님이 존재하는 위치 저장
        if arr[i][j] == "T":
            teachers.append((i,j))
        # 장애물을 설치할 수 있는 빈공간 위치저장
        if arr[i][j] == "X":
            spaces.append((i,j))

def watch(x,y,direction):
    # 왼쪽,오른쪽,위쪽, 아랫쪽 방향으로 감시
    if direction == 0:
        while y >= 0:
            if arr[x][y] == "S": # 학생이 있는경우
                return True
            if arr[x][y] == "O": # 장애물이 있는경우
                return False
            y -= 1
    if direction == 1:
        while y < n:
            if arr[x][y] == "S": # 학생이 있는경우
                return True
            if arr[x][y] == "O": # 장애물이 있는경우
                return False
            y += 1
    if direction == 2:
        while x >= 0:
            if arr[x][y] == "S": # 학생이 있는경우
                return True
            if arr[x][y] == "O": # 장애물이 있는경우
                return False
            x -= 1
    if direction == 3:
        while x < n:
            if arr[x][y] == "S": # 학생이 있는경우
                return True
            if arr[x][y] == "O": # 장애물이 있는경우
                return False
            x += 1
    return False

def process():
    # 모든 선생님의 위치를 하나씩 확인
    for x,y in teachers:
        for i in range(4):
            if watch(x,y,i):
                return True
    return False


find = False # 학생이 감지여부

# 빈 공간에서 3개를 뽑는 모든 조합을 확인
for data in combinations(spaces,3):
    # 장애물 설치해보기
    for x,y in data:
        arr[x][y] = 'O'
    # 학생이 한 명도 감지되지 않는 경우
    if not process():
        # 원하는 경우를 발견
        find = True
        break
    # 설치된 장애물 다시 없애기
    for x,y in data:
        arr[x][y] = "X"

if find:
    print("YES")
else:
    print("NO")