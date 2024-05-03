import sys
import itertools

ans = int(1e9)

n = int(sys.stdin.readline().rstrip())

arr = [list(map(int,sys.stdin.readline().rstrip().split())) for _ in range(n)]

d,e,f = map(int,sys.stdin.readline().rstrip().split())

for i in range(2, n+1):

    if i > 7:
        break
    k = itertools.combinations(arr,i)

    for j in k:
        a, b, c = 0, 0, 0

        for p in j:
            a += p[0]
            b += p[1]
            c += p[2]
        a //= i
        b //= i
        c //= i
        ans = min(ans, (abs(a-d) + abs(b-e) + abs(c-f)))

print(ans)




