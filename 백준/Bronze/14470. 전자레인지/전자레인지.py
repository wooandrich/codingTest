temp = int(input())
ans = int(input())
minus = int(input())
zero = int(input())
hot = int(input())

result = 0

while temp != ans:
    if temp < 0:
        temp += 1
        result += minus
    else:
        if temp == 0:
            result += zero
        temp += 1
        result += hot
print(result)