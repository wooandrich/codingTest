def solution(n, m, section):
    answer = 0
    
    idx = 0
    for s in section:
        if s > idx:
            answer += 1
            idx = s + m - 1
    
    
    
    
    return answer