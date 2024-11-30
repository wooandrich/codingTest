import sys

input = sys.stdin.readline

r,c,t = map(int,input().split())

arr = [list(map(int,input().split())) for _ in range(r)]

clean_one = []
clean_two = []

# t 초만큼 반복
for _ in range(t):

    # 확산 로직
    temp = []
    for i in range(r):
        for j in range(c):
            if arr[i][j] >= 5:
                # 확산이 어느방향으로 몇번되었는지 체크
                cnt = 0
                for k in [[0,1],[0,-1],[1,0],[-1,0]]:
                    nx = i + k[0]
                    ny = j + k[1]
                    if 0 <= nx < r and 0 <= ny < c and arr[nx][ny] >= 0:
                        cnt += 1
                        temp.append([nx,ny,arr[i][j] // 5])
                arr[i][j] -= arr[i][j] // 5 * cnt
            if arr[i][j] == -1:
                if len(clean_one) == 0:
                    clean_one.append([i,j])
                else:
                    clean_two.append([i,j])

    for x,y,val in temp:
        arr[x][y] += val


    # 공기청정기 로직

    # 첫번째 공기청정기 위에서 아래로
    for i in range(clean_one[0][0] - 1, -1, -1):
        if i == clean_one[0][0] - 1:
            arr[i][clean_one[0][1]] = 0
        else:
            arr[i+1][clean_one[0][1]] = arr[i][clean_one[0][1]]

    # 첫번째 공기청정기 오른쪽에서 왼쪽으로
    for i in range(clean_one[0][1] + 1, c):
        arr[0][i-1] = arr[0][i]

    # 첫번째 공기청정기 아래에서 위로
    for i in range(1, clean_one[0][0] + 1):
        arr[i-1][c-1] = arr[i][c-1]

    # 첫번째 공기청정기 왼쪽에서 오른쪽으로
    for i in range(c-2, 0, -1):
        arr[clean_one[0][0]][i+1] = arr[clean_one[0][0]][i]
        if i == 1:
            arr[clean_one[0][0]][i] = 0

    # 두번째 공기청정기 아래에서 위로
    for i in range(clean_two[0][0] + 1, r):
        if i == clean_two[0][0] + 1:
            arr[i][clean_two[0][1]] = 0
        else:
            arr[i-1][clean_two[0][1]] = arr[i][clean_two[0][1]]

    # 두번째 공기청정기 오른쪽에서 왼쪽으로
    for i in range(clean_two[0][1] + 1, c):
        arr[r-1][i - 1] = arr[r-1][i]

    # 두번째 공기청정기 위에서 아래로
    for i in range(r-2, clean_two[0][0] - 1, -1):
        arr[i+1][c-1] = arr[i][c-1]

    # 두번째 공기청정기 왼쪽에서 오른쪽으로
    for i in range(c-2, 0, -1):
        arr[clean_two[0][0]][i+1] = arr[clean_two[0][0]][i]
        if i == 1:
            arr[clean_two[0][0]][i] = 0
ans = 0
for i in range(r):
    for j in range(c):
        if arr[i][j] >= 0:
            ans += arr[i][j]
print(ans)
