import sys
import math

input = sys.stdin.readline


a,b,c,d,e,f = map(int,input().split())

ans_x = 0
ans_y = 0

for x in range(-999,1000):
    for y in range(-999,1000):
        if a*x + b*y == c and d*x+e*y == f:
            ans_x = x
            ans_y = y
            break
print(ans_x,ans_y)



