import sys
import math

input = sys.stdin.readline

a,b = map(int,input().split())

divide = b // a

for p in range(int(divide ** 0.5), 0, -1):
    q = int(divide / p)

    if divide % p == 0 and math.gcd(p,q) == 1:
        print(p * a, q * a)
        break