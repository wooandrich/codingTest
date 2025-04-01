def solution(s):
    answer = ''
    
    a = s.split(" ")
    
    for k in a:
        if k:
            answer += (k[0].upper() + k[1:].lower())
            answer += " "
        else:
            answer += " "
    
    
    
    return answer[:len(answer)-1]