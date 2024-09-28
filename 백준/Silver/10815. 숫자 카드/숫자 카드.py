import sys

input = sys.stdin.readline

n = int(input())

arr1 = sorted(list(map(int, input().split())))

target = int(input())

arr2 = list(map(int, input().split()))

ans = []

for number in arr2:
    s = 0
    e = n-1
    flag = False

    while s <= e:
        mid = (s+e)//2
        if arr1[mid] == number:
            flag = True
            break

        if arr1[mid] < number:
            s = mid + 1
        else:
            e = mid - 1
    if flag:
        ans.append(1)
    else:
        ans.append(0)
print(*ans)