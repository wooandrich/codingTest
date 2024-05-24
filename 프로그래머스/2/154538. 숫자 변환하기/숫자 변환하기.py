from collections import deque

def solution(x, y, n):
    answer = 0
    
    return sol(x,y,n,0)

def sol(x,y,n,ans):
    global answer
    Maxval = 1000000
    visited = [False] * (Maxval + 1)
    q = deque()
    q.append((x,y,n,ans))
    visited[x] = True
    
    while q:
        a,b,cnt,result = q.popleft()
        if a == b:
            return result
        elif a > 1000000:
            break
        for k in (a + cnt, a * 2, a* 3):
            if 1<=k<=Maxval and not visited[k] :
                q.append((k,b,cnt,result+1))
                visited[k] = True
    return -1

