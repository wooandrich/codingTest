arr = [i for i in range(1,31)]

for _ in range(28):
    num = int(input())
    arr.remove(num)
print(arr[0])
print(arr[1])