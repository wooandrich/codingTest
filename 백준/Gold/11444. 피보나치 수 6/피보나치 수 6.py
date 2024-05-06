import sys

n = int(sys.stdin.readline().rstrip())

p = 1000000007

def square(fibo,n):
    if n == 1:
        for x in range(len(fibo)):
            for y in range(len(fibo)):
                fibo[x][y] %= p
        return fibo

    temp = square(fibo, n//2)
    if n%2:
        return mul(mul(temp,temp),fibo)
    else:
        return mul(temp, temp)


def mul(A,B):
    length = len(A)
    Z = [[0]*length for _ in range(length)]

    for row in range(length):
        for col in range(length):
            e = 0
            for i in range(length):
                e += A[row][i] * B[i][col]
            Z[row][col] = e % p
    return Z



fibo = [[1,1],[1,0]]

print(square(fibo,n)[0][1])