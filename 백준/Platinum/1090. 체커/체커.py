import sys

input = sys.stdin.readline

n = int(input())

arr = [list(map(int, input().split())) for _ in range(n)]



x = set()
y = set()

for k in arr:
    x.add(k[0])
    y.add(k[1])

ans = [0]

for i in range(2,n+1):
    temp = []
    for a in x:
        for b in y:
            cnt = []
            for k in arr:
                val = abs(a - k[0]) + abs(b - k[1])
                cnt.append(val)
            cnt.sort()
            temp.append(cnt)
    temp.sort(key=lambda x: sum(x[:i]))
    ans.append(sum(temp[0][:i]))


print(*ans)

