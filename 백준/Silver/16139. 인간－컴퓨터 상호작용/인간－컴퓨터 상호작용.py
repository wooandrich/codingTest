import sys

s = sys.stdin.readline().rstrip()

q = int(sys.stdin.readline().rstrip())

for tc in range(q):
    a,l,r = sys.stdin.readline().rstrip().split()
    l = int(l)
    r = int(r)

    temp = s[l:r+1]
    print(temp.count(a))

