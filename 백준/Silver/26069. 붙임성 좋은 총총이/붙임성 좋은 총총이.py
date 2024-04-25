import sys

n = int(sys.stdin.readline().rstrip())

arr = ["ChongChong"]

for _ in range(n):
    a,b = sys.stdin.readline().rstrip().split()

    if a in arr or b in arr:
        if a not in arr:
            arr.append(a)
        elif b not in arr:
            arr.append(b)
print(len(arr))



