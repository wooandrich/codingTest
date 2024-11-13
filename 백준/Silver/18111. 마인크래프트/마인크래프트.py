import sys

input = sys.stdin.readline

n, m, b = map(int, input().split())

arr = [list(map(int, input().split())) for _ in range(n)]

cnt = dict()

for i in range(n):
    for j in range(m):
        if arr[i][j] not in cnt:
            cnt[arr[i][j]] = 1
        else:
            cnt[arr[i][j]] += 1
cnt = sorted(cnt.items(), key=lambda x: x[0], reverse=True)

ans_time = int(1e9)
ans_height = cnt[0][0]

for num in range(ans_height, -1, -1):
    count = b
    time = 0
    sign = True
    for i, j in cnt:
        if i == num:
            continue
        if i > num:
            time += 2 * abs(i - num) * j
            count += abs(i - num) * j
        if i < num:
            if abs(i - num) * j <= count:
                count -= abs(i - num) * j
                time += abs(i - num) * j
            else:
                sign = False
                break
    if sign:
        if time < ans_time:
            ans_time = time
            ans_height = num

print(ans_time, ans_height)
