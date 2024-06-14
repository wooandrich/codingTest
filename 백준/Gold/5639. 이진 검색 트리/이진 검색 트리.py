import sys
sys.setrecursionlimit(10**9)

input = sys.stdin.readline

def post(start, end):
    if start > end:
        return

    idx = end + 1
    for i in range(start + 1, end + 1):
        if pre[i] > pre[start]:
            idx = i
            break
    post(start+1, idx - 1)
    post(idx, end)
    print(pre[start])

pre = []
while 1:
    try:
        pre.append(int(input()))
    except:
        break

post(0, len(pre) - 1)


