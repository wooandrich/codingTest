arr = [25, 10, 5, 1]

for tc in range(int(input())):
    c = int(input())
    ans = [0] * 4

    for i in range(4):
        ans[i] += c // arr[i]
        c %= arr[i]
    print(' '.join(map(str, ans)))