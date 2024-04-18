n = int(input())
a=n-1
b=1
for i in range(1,2*n):
    if i < n:
        print(" "*a+"*"*b)
        a -= 1
        b += 2
    else:
        print(" " * a + "*" * b)
        a += 1
        b -= 2


