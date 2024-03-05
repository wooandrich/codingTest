n = int(input())
coin_types = [500, 100,50,10,5,1]
count = 0
k = 1000-n

for coin in coin_types:
    count += k // coin
    k %= coin
print(count)