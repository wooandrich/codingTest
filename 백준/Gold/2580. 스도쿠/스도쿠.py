import sys


def row(a,n): #가로
    for i in range(9):
        if n == arr[a][i]:
            return False
    return True

def column(a,n):
    #세로
    for i in range(9):
        if n == arr[i][a]:
            return False
    return True

def square(y,x,n):
    for i in range(3):
        for j in range(3):
            if n == arr[y//3 * 3 + i][x//3 * 3 + j]:
                return False
    return True

def find(n):
    if n == len(blank):
        for i in arr:
            print(*i)
        exit()
    for i in range(1,10):
        y = blank[n][0]
        x = blank[n][1]

        if row(y,i) and column(x,i) and square(y,x,i):
            arr[y][x] = i
            find(n+1)
            arr[y][x] = 0





arr = []
blank = []

for _ in range(9):
    arr.append(list(map(int, sys.stdin.readline().rstrip().split())))

for i in range(9):
    for j in range(9):
        if arr[i][j] == 0:
            blank.append((i,j))

find(0)
