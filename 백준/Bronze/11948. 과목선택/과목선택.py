arr = []
arr_2 = []
for i in range(4):
    arr.append(int(input()))
for i in range(2):
    arr_2.append(int(input()))
arr.sort(reverse=True)
arr_2.sort(reverse=True)

ans = arr[0] + arr[1] + arr[2] + arr_2[0]

print(ans)