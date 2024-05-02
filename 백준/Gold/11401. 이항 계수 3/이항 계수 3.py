import sys

N,K = map(int,sys.stdin.readline().rstrip().split())
p = 1000000007


def factorial(N):
    n = 1

    for i in range(2,N+1):
        n  = (n * i) % p
    return n

def square(n,k):
    if k == 0:
        return 1

    temp = square(n, k // 2)

    if k % 2: # k 홀수
        return temp * temp * n % p
    else: # k 짝수
        return temp * temp % p







top = factorial(N)
bot = factorial(N-K) * factorial(K) % p

print(top * square(bot, p-2) % p)