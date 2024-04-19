import sys
import math

input = sys.stdin.readline


n = int(input())

ans = 666
cnt = 0

while 1:
    if '666' in str(ans):
        cnt += 1
    if n == cnt:
        break
    ans += 1
print(ans)








