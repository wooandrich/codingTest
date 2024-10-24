import sys

input = sys.stdin.readline

game, win = map(int, input().split())
z = win * 100 // game
if game == win:
    print(-1)
elif z == 99:
    print(-1)
else:

    ans = int(1e9)

    start = 1
    end = 10 ** 9
    while start <= end:
        mid = (start + end) // 2

        new_game = game + mid
        new_win = win + mid

        new_z = new_win * 100 // new_game
        if new_z == z:
            start = mid + 1
        else:
            ans = min(ans, mid)
            end = mid - 1
    print(ans)