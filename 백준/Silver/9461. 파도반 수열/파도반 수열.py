import sys



for tc in range(int(sys.stdin.readline().rstrip())):
    arr = [0, 1, 1, 1]
    n = int(sys.stdin.readline().rstrip())

    if n <= 3:
        print(arr[n])
    else:
        for i in range(4,n+1):
            arr.append(arr[i-3] + arr[i-2])
        print(arr[n])
