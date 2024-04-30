import sys

s = sys.stdin.readline().rstrip()
cnt = [[0 for _ in range(26)] for _ in range(len(s))]
cnt[0][ord(s[0])-97] = 1
for i in range(1,len(s)):
    cnt[i][ord(s[i]) - 97] = 1
    for j in range(26):
        cnt[i][j] += cnt[i-1][j]


q = int(sys.stdin.readline().rstrip())

for tc in range(q):
    alpha,l,r = sys.stdin.readline().rstrip().split()
    l = int(l)
    r = int(r)

    if l > 0:
        result = cnt[r][ord(alpha)-97] - cnt[l-1][ord(alpha)-97]
    else:
        result = cnt[r][ord(alpha)-97]
    print(result)

