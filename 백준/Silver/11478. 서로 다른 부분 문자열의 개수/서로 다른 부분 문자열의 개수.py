import sys
import itertools


s = sys.stdin.readline().rstrip()

ans = set()

for i in range(len(s)+1):
    for j in range(len(s)-i+1):
        ans.add(s[j:j+i])
print(len(ans) - 1)









