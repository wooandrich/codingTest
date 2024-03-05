n,k=map(int, input().split())
coin_type = []
ans = 0
for i in range(n):
    coin_type.append(int(input()))
coin_type.sort(reverse=True)

for coin in coin_type:
    ans += k // coin
    k %= coin
print(ans)