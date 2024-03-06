s = input()

a = 0
b = 0
now = int(s[0])

if int(now) == 0:
    a+=1
else:
    b+=1

for num in s:
    if int(num) != int(now):
        if int(num) == 0:
            a += 1
        else:
            b += 1
        now = int(num)

print(min(a,b))