import sys


prime = [False, False] + [True] * 999999

for i in range(2,1000001):
    if prime[i]:
        for j in range(i*2, 1000001, i):
            prime[j] = False

for tc in range(int(sys.stdin.readline().rstrip())):
    cnt = 0

    n = int(sys.stdin.readline().rstrip())


    for i in range(2, n//2+1):
        if prime[i] and prime[n-i]:
            cnt += 1
    print(cnt)

















