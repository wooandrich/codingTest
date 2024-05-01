import sys

n = int(sys.stdin.readline().rstrip())

length = list(map(int,sys.stdin.readline().rstrip().split()))
price = list(map(int,sys.stdin.readline().rstrip().split()))

now = price[0]
ans = 0
for i in range(len(length)):
    ans += now * length[i]

    now = min(now, price[i+1])
print(ans)

