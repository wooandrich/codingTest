arr = []

for i in range(9):
    arr.append(list(map(int,input().split())))

max_val = -1
a = 0
b = 0

for i in range(9):
    for j in range(9):
        if arr[i][j] > max_val:
            max_val = arr[i][j]
            a = i+1
            b = j+1
print(max_val)
print(a,b)