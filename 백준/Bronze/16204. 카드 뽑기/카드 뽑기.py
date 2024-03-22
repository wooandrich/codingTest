n,m,k = map(int, input().split())

o = m
x = n-m

plus_o = k
plus_x = n-k

print(min(o,plus_o) + min(x,plus_x))