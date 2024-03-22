a,b = map(int, input().split())
sum = a+b
ch = int(input())

if sum - 2*ch >= 0:
    print(sum - 2 * ch)
else:
    print(sum)