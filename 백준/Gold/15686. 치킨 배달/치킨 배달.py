import itertools
import sys
from itertools import *

ans = 100000

n,m = map(int, sys.stdin.readline().rstrip().split())

#지도 생성
arr = []

for _ in range(n):
    arr.append(list(map(int, sys.stdin.readline().rstrip().split())))

# 치킨집 좌표
chicken = []

# 집 좌표
home = []

for i in range(n):
    for j in range(n):
        if arr[i][j] == 2:
            chicken.append([i,j])
        elif arr[i][j] == 1:
            home.append([i,j])


# 치킨집 조합 리스트
chicken_list = list(itertools.combinations(chicken,m))

# 도시의 치킨거리 초기화


# 치킨 조합별로 도시의 치킨거리 구하기
for k in chicken_list:
    cnt = 0
    for home_point in home:
        temp = 100000
        for p in k:
            temp = min(temp, (abs(home_point[0] - p[0]) + abs(home_point[1] - p[1])))
        cnt += temp
    ans = min(cnt, ans)

print(ans)
