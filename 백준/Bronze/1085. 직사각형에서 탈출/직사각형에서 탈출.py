import sys

input = sys.stdin.readline

x,y,w,h = map(int,input().split())

ans = min(abs(x-0), abs(x-w), abs(y-0), abs(y-h))

print(ans)