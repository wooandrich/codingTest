def fib(n):
    if n == 1 or n == 2:
        return 1
    else:
        return fib(n-1) + fib(n-2)



n = int(input())

f = [1,1]

ans = 0

for i in range(2, n):
    f.append(f[i-1] + f[i-2])
    ans += 1


print(fib(n),ans)
