a = input()

arr = []
for i in a:
    arr.append(i)

num1 = ""
num2 = 0

if a[-1] == '0':
    num2 = 10
    arr.pop(-1)
    arr.pop(-1)

else:
    num2 = int(a[-1])
    arr.pop(-1)
for i in arr:
    num1 += i

num1 = int(num1)

print(num1+num2)