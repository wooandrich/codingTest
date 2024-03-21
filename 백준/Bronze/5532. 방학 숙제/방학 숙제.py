l = int(input())
a = int(input())
b = int(input())
c = int(input())
d = int(input())

ans_1 = 0
ans_2 = 0

if a % c == 0:
    ans_1 = a //c
else:
    ans_1 = a//c + 1

if b % d == 0:
    ans_2 = b //d
else:
    ans_2 = b//d + 1

print(l - max(ans_1, ans_2))