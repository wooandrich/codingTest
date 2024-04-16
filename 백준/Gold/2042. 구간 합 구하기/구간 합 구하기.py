import sys
from math import ceil, log

def segment(left, right, i):
    if left == right:
        segment_tree[i] = arr[left-1]
        return segment_tree[i]
    mid = (left + right) // 2
    segment_tree[i] = segment(left, mid, i*2) + segment(mid+1, right, i*2 + 1)
    return segment_tree[i]

def query_sum(start, end, idx, left, right):
    if start > right or end < left:
        return 0
    if start >= left and end <= right:
        return segment_tree[idx]
    mid = (start + end) // 2
    return query_sum(start, mid, idx*2, left, right) + query_sum(mid + 1, end, idx*2+1,left,right)

def update(start, end, idx, update_idx, update_val):
    if start > update_idx  or update_idx > end:
        return
    segment_tree[idx] += update_val

    if start == end:
        return
    mid = (start + end) // 2
    update(start, mid, idx*2, update_idx,update_val)
    update(mid+1, end, idx*2+1, update_idx,update_val)


n,m,k = map(int, sys.stdin.readline().rstrip().split())

arr = []

for _ in range(n):
    arr.append(int(sys.stdin.readline().rstrip()))


segment_tree = [0] * (n*4)
segment(1,n,1)
for _ in range(m+k):
    a,b,c = map(int, sys.stdin.readline().rstrip().split())
    if a == 1:
        temp = c - arr[b-1]
        arr[b-1] = c
        update(1,n,1,b,temp)
    elif a == 2:
        print(query_sum(1,n,1,b,c))