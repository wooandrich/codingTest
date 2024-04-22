import sys

def merge_sort(A,p,r):
    if p < r:
        q = (p+r) // 2
        merge_sort(A,p,q)
        merge_sort(A,q+1,r)
        merge(A,p,q,r)

def merge(A,p,q,r):
    global cnt, ans
    i = p
    j = q+1
    tmp = []
    while i <= q and j <= r:
        if A[i] <= A[j]:
            tmp.append(A[i])
            i += 1
        else:
            tmp.append(A[j])
            j += 1

    while i <= q:
        tmp.append(A[i])
        i += 1

    while j <= r:
        tmp.append(A[j])
        j += 1

    i = p
    t = 0

    while i <= r:
        A[i] = tmp[t]

        cnt += 1

        if cnt == k:
            ans = A[i]
            break
        i += 1
        t += 1











n,k = map(int, sys.stdin.readline().rstrip().split())
A = list(map(int,sys.stdin.readline().rstrip().split()))

cnt = 0
ans = -1

merge_sort(A,0,n-1)

print(ans)

