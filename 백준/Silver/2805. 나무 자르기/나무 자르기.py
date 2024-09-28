import sys

input = sys.stdin.readline

n,target = map(int,input().split())

arr = sorted(list(map(int,input().split())))

s = 0
e = arr[-1]
ans = 0
while s <= e:
    mid = (s+e)//2
    cnt = 0

    for i in arr:
        if i > mid:
            cnt += i - mid

    if cnt < target:
        e = mid - 1
    else:
        s = mid + 1
print(e)