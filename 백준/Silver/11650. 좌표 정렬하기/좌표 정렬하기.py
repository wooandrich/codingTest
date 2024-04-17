n = int(input())

arr = []

for i in range(n):
    a,b = map(int,input().split())
    arr.append((a,b))
arr.sort(key=lambda x:(x[0], x[1]))

for i in arr:
    a,b = i[0],i[1]
    print(a,b)
