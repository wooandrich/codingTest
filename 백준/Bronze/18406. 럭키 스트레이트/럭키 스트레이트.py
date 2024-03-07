s = input()

num1 = 0
num2 = 0

for i in range(len(s)//2):
    num1 += int(s[i])

for i in range(len(s)//2, (len(s))):
    num2 += int(s[i])

if num1 == num2:
    print("LUCKY")
else:
    print("READY")