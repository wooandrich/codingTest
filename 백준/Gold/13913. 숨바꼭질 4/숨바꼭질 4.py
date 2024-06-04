import sys
from collections import deque

input = sys.stdin.readline

n,k = map(int,input().split())

arr = [False] * (100001)

arr[n] = True

q = deque()

q.append((n,0))
result = [(n,0)]
while q:
    now,cnt = q.popleft()
    if now == k:
        print(cnt)
        break
    for i in (now - 1, now + 1, now * 2):
        if 0<=i<=100000 and not arr[i]:
            arr[i] = True
            q.append((i, cnt + 1))
            result.append((i, cnt + 1))


num = 0
cnt = 0
ans = []
for a,b in result[::-1]:
    if a == k:
        num = a
        cnt = b
        ans.append(a)
    if b == cnt -1:
        if num % 2 == 0:
            if num - 1 == a or num + 1 == a or num // 2 == a:
                num = a
                cnt = b
                ans.append(a)
        else:
            if num - 1 == a or num + 1 == a:
                num = a
                cnt = b
                ans.append(a)
print(*ans[::-1])



