import sys

n = int(sys.stdin.readline().rstrip())

arr = [list(map(int,sys.stdin.readline().rstrip().split())) for _ in range(n)]
a = []

def result(x,y,n):
    if n == 1:
        return arr[x][y]
    else:
        temp = [result(x,y,n//2), result(x,y+(n//2), n//2), result(x+n//2, y, n//2), result(x+n//2, y+ n//2, n//2)]
        temp.sort()
        return temp[1]





print(result(0,0,n))
