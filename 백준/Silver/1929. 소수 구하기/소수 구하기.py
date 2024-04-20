import sys


a,b = map(int, sys.stdin.readline().rstrip().split())

for i in range(a,b+1):
    if i == 1:
        continue
    end = int(i ** (1/2))
    prime = True
    for j in range(2, end+1):
        if i % j == 0:
            prime = False
            break
    if prime:
        print(i)













