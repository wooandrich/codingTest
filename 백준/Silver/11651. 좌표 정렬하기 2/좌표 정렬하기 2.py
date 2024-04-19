import sys

input = sys.stdin.readline


n = int(input())
ans = []
for _ in range(n):
    a,b = map(int,input().split())
    ans.append((a,b))
ans.sort(key=lambda x:(x[1], x[0]))

for i in ans:
    a,b = i
    print(a,b)






