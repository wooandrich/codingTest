

def solution(s):
    answer = 0
    p,q = 0,0
    start = s[0]
    for i in range(len(s)):
        if s[i] == start:
            p += 1
        else:
            q += 1
        
        if p == q:
            p,q = 0,0
            answer += 1
            if i == len(s) - 1:
                break
            else:
                start = s[i+1]
    if p != 0:
        answer += 1
    
    
    
    return answer