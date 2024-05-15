import sys
import math

for tc in range(int(sys.stdin.readline().rstrip())):
    n = int(sys.stdin.readline().rstrip())
    start = math.isqrt(n)
    ans = 0
    for i in range(1,start+1):
        if not n % i:
            a = i
            b = n // i
            if math.lcm(a,b) == n:
                ans += 1
    print(ans)
