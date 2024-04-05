n = int(input())

num = n % 8

if num == 0:
    num = 2
elif num == 7:
    num = 3
elif num == 6:
    num = 4
print(num)