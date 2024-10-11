import sys

input = sys.stdin.readline

a,b,c,d,e,f = map(int, input().split())

for x in range(-999,1000):
    flag = False
    for y in range(-999,1000):
        if a * x + b * y == c:
            if d * x + e * y == f:
                print(x,y)
                flag = True
                break
    if flag:
        break
