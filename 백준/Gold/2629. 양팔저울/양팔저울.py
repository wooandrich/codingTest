import sys

a = int(sys.stdin.readline().rstrip())
chu = list(map(int, sys.stdin.readline().rstrip().split()))
weights = int(sys.stdin.readline().rstrip())
target = list(map(int, sys.stdin.readline().rstrip().split()))
dp = [[False for _ in range(15001)] for _ in range(31)]


def cal(size, weight):
    if size > a:
        return

    if dp[size][weight]:
        return

    dp[size][weight] = True

    cal(size+1, weight + chu[size-1])
    cal(size+1, abs(weight - chu[size-1]))
    cal(size+1, weight)






cal(0,0)

for case in target:
    if case > 15000:
        print("N", end=' ')

    elif dp[a][case]:
        print("Y", end=' ')
    else:
        print("N", end=' ')
