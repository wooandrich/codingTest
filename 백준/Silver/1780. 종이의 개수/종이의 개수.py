import sys
sys.setrecursionlimit(10**6)

n = int(sys.stdin.readline().rstrip())

arr = [list(map(int,sys.stdin.readline().rstrip().split())) for _ in range(n)]

ans = [0] * 3





def tree(x,y,n):
    color = arr[x][y]

    for i in range(x, x+n):
        for j in range(y, y+n):

            if color != arr[i][j]:
                for a in range(3):
                    for b in range(3):
                        tree(x + n//3 * a, y+ n//3*b, n//3)
                return


    if color == -1:
        ans[0] += 1
    elif color == 0:
        ans[1] += 1
    else:
        ans[2] += 1



tree(0,0,n)
print('\n'.join(map(str,ans)))


