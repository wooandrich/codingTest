arr = list(map(int, input().split()))

sum = 0

for i in arr:
    sum += i * i

print(sum % 10)