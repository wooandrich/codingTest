import sys

n,m = map(int,sys.stdin.readline().rstrip().split())

arr = {}
for _ in range(n):
    word = sys.stdin.readline().rstrip()
    if len(word) >= m:
        if word in arr:
            arr[word] += 1
        else:
            arr[word] = 1
arr = sorted(arr.items(), key=lambda x:(-x[1],-len(x[0]),x[0]))
arr = list(arr)
for a,b in arr:
    print(a)