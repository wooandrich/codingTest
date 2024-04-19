import sys

input = sys.stdin.readline


n = int(input())
ans = []

for i in range(n):
    a,b = input().split()
    ans.append((int(a), b, i))
ans.sort(key=lambda x:(x[0], x[2],))

for i in ans:
    a,b = i[0],i[1]
    print(a,b)






