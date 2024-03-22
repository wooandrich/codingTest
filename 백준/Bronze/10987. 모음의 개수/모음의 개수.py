a = input()

arr = ['a', 'e', 'i','o','u']
cnt = 0
for i in a:
    if i in arr:
        cnt += 1
print(cnt)
