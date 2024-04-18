s = input()
sign = 1
for i in range(len(s)):
    if s[i] != s[-i-1]:
        sign = 0
print(sign)