import sys

input = sys.stdin.readline

while 1:
    n = int(input())
    if n == -1:
        break

    arr = []

    for i in range(1,n):
        if n % i == 0:
            arr.append(i)
    if n == sum(arr):
        print(n, "= ",end='')
        for k in range(len(arr)-1):
            print(arr[k],"+ ",end="")
        print(arr[len(arr)-1])
    else:
        print(n,"is NOT perfect.")

