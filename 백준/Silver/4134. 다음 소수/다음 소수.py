import sys
import math

for tc in range(int(sys.stdin.readline().rstrip())):
    n = int(sys.stdin.readline().rstrip())



    while 1:
        if n == 0 or n == 1:
            n = 2
            break
        prime = True
        end = int(n**(1/2))

        for i in range(2, end+1):
            if n % i == 0:
                prime = False
                break
        if prime:
            break
        n += 1

    print(n)











