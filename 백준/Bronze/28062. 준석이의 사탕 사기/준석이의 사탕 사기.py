import sys

n = int(sys.stdin.readline().rstrip())

arr = list(map(int, sys.stdin.readline().rstrip().split()))

arr.sort()

ans = sum(arr)

if ans % 2 == 0:
    print(ans)
else:
    for i in arr:
        if i % 2 == 1:
            ans -= i
            break
    if ans % 2 == 1:
        print(0)
    else:
        print(ans)
