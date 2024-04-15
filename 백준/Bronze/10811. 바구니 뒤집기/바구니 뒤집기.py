n,m = map(int,input().split())


bucket = [i for i in range(1, n+1)]

for _ in range(m):
    i,j = map(int,input().split())
    temp = bucket[i-1:j]
    temp.reverse()
    bucket[i-1:j] =temp
print(' '.join(map(str, bucket)))