import sys
import math

a,b = map(int,sys.stdin.readline().rstrip().split())
c,d = map(int,sys.stdin.readline().rstrip().split())

p = math.lcm(b,d)

q = p // b * a + p // d * c

k = math.gcd(p,q)

if k == 1:
    print(q, p)
else:
    print(q // k, p//k)











