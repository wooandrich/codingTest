import sys

input = sys.stdin.readline


for tc in range(int(input())):
    n = int(input())
    arr = list(map(int, input().split()))
    ans = 0
    now = arr[-1]
    for i in range(n-2, -1, -1):
        if now > arr[i]:
            ans += now - arr[i]
        else:
            now = arr[i]
    print(ans)
