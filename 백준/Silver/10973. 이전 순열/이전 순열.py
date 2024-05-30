import sys

input = sys.stdin.readline

n = int(input())


a = list(map(int,input().split()))

for i in range(n-1,0,-1):
    if a[i-1] > a[i]:
        for j in range(n-1,0,-1):
            if a[i-1] > a[j]:
                a[i-1],a[j] = a[j], a[i-1]
                a = a[:i] + sorted(a[i:], reverse=True)
                print(*a)
                exit(0)
print(-1)
