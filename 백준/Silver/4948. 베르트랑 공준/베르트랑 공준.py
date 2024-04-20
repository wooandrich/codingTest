import sys


while 1:
    n = int(sys.stdin.readline().rstrip())
    if n == 0:
        break
    cnt = 0

    for i in range(n+1, 2*n+1):
        end = int(i**(1/2))
        prime = True
        for j in range(2,end+1):
            if i % j == 0:
                prime = False
                break
        if prime:
            cnt += 1
    print(cnt)














