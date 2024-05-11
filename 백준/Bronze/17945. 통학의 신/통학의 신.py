import math
import sys

a,b = map(int,sys.stdin.readline().rstrip().split())

ans_1 = -a + int(math.sqrt(a**2 - b))
ans_2 = -a - int(math.sqrt(a**2 - b))


if ans_1 == ans_2:
    print(ans_1)
else:
    if ans_1 >= ans_2:
        print(ans_2, ans_1)
    else:
        print(ans_1,ans_2)
