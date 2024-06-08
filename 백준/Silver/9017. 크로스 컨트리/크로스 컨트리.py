import sys
from collections import Counter

input = sys.stdin.readline


for tc in range(int(input())):
    n = int(input())
    arr = list(map(int, input().split()))
    cnt = Counter(arr)
    result = [[] for _ in range(201)]
    idx = 1
    for num in arr:
        if cnt[num] >=6:
            result[num].append(idx)
            idx += 1

    ans = 0
    sum_ans = int(1e9)
    for i in range(len(result)):
        if len(result[i]) == 0:
            continue
        temp = sum(result[i][:4])
        if temp < sum_ans:
            ans = i
            sum_ans = temp
        elif temp == sum_ans:
            if result[ans][4] > result[i][4]:
                ans = i

    print(ans)

