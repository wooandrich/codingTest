a = input()
b = input()

dp = []

for i in range(len(a)):
    dp.append(int(a[i]))
    dp.append(int(b[i]))


for _ in range(14):
    for i in range(len(dp) - 1):
        dp[i] = (dp[i] + dp[i+1]) % 10

for i in range(2):
    print(dp[i] , end='')


