l, p = map(int, input().split())

arr = list(map(int,input().split()))

size = l * p

for a in arr:
    print(a - size, end=' ')