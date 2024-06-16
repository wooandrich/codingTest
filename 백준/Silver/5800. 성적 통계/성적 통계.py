import sys

input = sys.stdin.readline

for i in range(int(input())):
    data = list(map(int,input().split()))
    num = data[0]
    arr = data[1:]
    arr.sort(reverse=True)
    gap = 0
    for k in range(len(arr) - 1):
        gap = max(gap, arr[k] - arr[k+1])
    max_val = max(arr)
    min_val = min(arr)

    print("Class",i+1)
    print(f"""Max {max_val}, Min {min_val}, Largest gap {gap}""")



