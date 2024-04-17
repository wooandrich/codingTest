import sys
from math import ceil, log

def segment(start, end, index):
    # 제일 위에 있을때
    if start == end:
        segment_tree[index] = arr[start]
    else:
        mid = (start + end) // 2
        segment_tree[index] = segment(start, mid, index*2) * segment(mid+1, end, index*2 + 1) % 1000000007
    return segment_tree[index]

def query_mul(start, end, idx, left, right):
    if start > right or end < left:
        return 1
    if start >= left and end <= right:
        return segment_tree[idx]
    mid = (start + end) // 2
    return query_mul(start, mid, idx*2, left, right) * query_mul(mid + 1, end, idx*2+1,left,right) % 1000000007

def update(start, end, idx, where, diff):
    if start > where  or where > end:
        return

    if start == end:
        segment_tree[idx] = diff
    else:
        mid = (start + end) // 2
        update(start, mid, idx*2, where, diff)
        update(mid + 1, end, idx*2 + 1, where, diff)
        segment_tree[idx] = segment_tree[idx*2] * segment_tree[idx*2 + 1] % 1000000007


n,m,k = map(int, sys.stdin.readline().rstrip().split())

arr = []

for _ in range(n):
    arr.append(int(sys.stdin.readline().rstrip()))


segment_tree = [0] * (n*4)
segment(0,n-1,1)
for _ in range(m+k):
    a,b,c = map(int, sys.stdin.readline().rstrip().split())
    if a == 1:
        update(0,n-1,1,b-1,c)
    elif a == 2:
        print(query_mul(0,n-1,1,b-1,c-1))