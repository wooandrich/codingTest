import sys
import itertools



n,m = map(int, sys.stdin.readline().rstrip().split())

result = itertools.product(range(1,n+1), repeat = m)
for i in result:
    print(' '.join(map(str,i)))