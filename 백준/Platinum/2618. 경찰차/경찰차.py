import sys

sys.setrecursionlimit(10 ** 6)

input = sys.stdin.readline


def find(dp, case1, case2, car1, car2, m):
    if dp[car1][car2] != -1:
        return dp[car1][car2]
    if car1 == m or car2 == m:
        return 0

    nextCase = max(car1, car2) + 1

    car1Distance = abs(case1[car1][0] - case1[nextCase][0]) + abs(case1[car1][1] - case1[nextCase][1])
    car2Distance = abs(case2[car2][0] - case2[nextCase][0]) + abs(case2[car2][1] - case2[nextCase][1])

    result1 = car1Distance + find(dp, case1, case2, nextCase, car2, m)
    result2 = car2Distance + find(dp, case1, case2, car1, nextCase, m)

    dp[car1][car2] = min(result1, result2)

    return dp[car1][car2]


def trace(dp, case1, case2, car1, car2, m):
    if car1 == m or car2 == m:
        return 0

    nextCase = max(car1, car2) + 1

    car1Distance = abs(case1[car1][0] - case1[nextCase][0]) + abs(case1[car1][1] - case1[nextCase][1])
    car2Distance = abs(case2[car2][0] - case2[nextCase][0]) + abs(case2[car2][1] - case2[nextCase][1])

    result1 = car1Distance + dp[nextCase][car2]
    result2 = car2Distance + dp[car1][nextCase]

    if result1 <= result2:
        print(1)
        trace(dp, case1, case2, nextCase, car2, m)
    else:
        print(2)
        trace(dp, case1, case2, car1, nextCase, m)


n = int(input())
m = int(input())

dp = [[-1 for _ in range(m + 1)] for _ in range(m + 1)]

startCar1 = [(1, 1)]
startCar2 = [(n, n)]

case = [tuple(map(int, input().split())) for _ in range(m)]
case1 = startCar1 + case
case2 = startCar2 + case

print(find(dp, case1, case2, 0, 0, m))
trace(dp, case1, case2, 0, 0, m)
