import sys

input = sys.stdin.readline

n = int(input())


a = list(map(int,input().split()))

for i in range(n-1,0,-1):
    if a[i] > a[i-1]:
        for j in range(n-1,0,-1):
            if a[j] > a[i-1]:
                a[i-1],a[j] = a[j], a[i-1]
                a = a[:i] + sorted(a[i:])
                print(*a)
                exit(0)
print(-1)
