import sys
from itertools import combinations

input = sys.stdin.readline
INF = int(1e9)

n,k = map(int,input().split())

arr = [list(map(int,input().split())) for _ in range(n)]
combi = [i for i in range(n)]
combi_list = combinations(combi,k)
ans = -INF
for temp in combi_list:
    temp_arr = combinations(temp,2)
    result = 0
    for row,col in temp_arr:
        result += arr[row][col]
    ans = max(ans, result)
print(ans)