import sys

input = sys.stdin.readline

n,x = map(int,input().split())

arr = list(map(int,input().split()))

if max(arr) == 0:
    print("SAD")
else:
    result = sum(arr[:x])
    max_value = result
    max_cnt = 1

    for i in range(x,n):
        result += arr[i]
        result -= arr[i-x]

        if result > max_value:
            max_value = result
            max_cnt = 1
        elif result == max_value:
            max_cnt += 1
    print(max_value)
    print(max_cnt)


