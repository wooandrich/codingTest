import re
import sys

s = sys.stdin.readline().rstrip()

s = re.split('([-|+])', s)

ans = 0
sign = True
for i in s:
    if i.isdecimal():
        if sign:
            ans += int(i)
        else:
            ans -= int(i)
    else:
        if i == '-':
            sign = False
print(ans)
