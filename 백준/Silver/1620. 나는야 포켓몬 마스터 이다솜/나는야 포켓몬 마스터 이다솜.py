import sys


n, m = map(int, sys.stdin.readline().rstrip().split())
dic1 = {}
dic2 = {}
for i in range(1, n+1):
    s = sys.stdin.readline().rstrip()
    dic1[s] = i
    dic2[i] = s

for _ in range(m):
    data = sys.stdin.readline().rstrip()
    if data.isdecimal():
        print(dic2[int(data)])
    else:
        print(dic1[data])











