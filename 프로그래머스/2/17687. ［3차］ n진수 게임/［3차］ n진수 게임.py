def sol(num, n):
    result = "0123456789ABCDEF"
    q,r = divmod(num, n)
    
    if q == 0:
        return result[r]
    return sol(q, n) + result[r]

def solution(n, t, m, p):
    answer = ''
    temp = ''
    
    for i in range(m * t):
        temp += sol(i, n)
    
    for i in range(p-1, m*t, m):
        answer += temp[i]
    
    return answer