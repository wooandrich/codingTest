import sys

input = sys.stdin.readline

n,x = map(int,input().split())

arr = sorted(list(map(int, input().split())))

s = 0
e = n-1
cnt = 0
remain = 0

while s <= e:
    if arr[e] == x:
        cnt += 1
        e -= 1
        continue
    if s == e:
        remain += 1
        break

    if arr[s] + arr[e] >= x / 2:
        cnt += 1
        e -= 1
        s += 1
    else:
        s += 1
        remain += 1
print(cnt + remain//3)
