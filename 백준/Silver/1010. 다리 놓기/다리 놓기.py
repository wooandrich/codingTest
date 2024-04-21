import sys


for tc in range(int(sys.stdin.readline().rstrip())):

    k,n = map(int, sys.stdin.readline().rstrip().split())

    a = 1
    b = 1

    for i in range(n, n-k, -1):
        a *= i

    for j in range(1, k+1):
        b *= j

    print(a//b)











