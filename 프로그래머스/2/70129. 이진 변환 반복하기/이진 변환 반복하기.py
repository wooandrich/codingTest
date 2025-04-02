def solution(s):
    answer = []
    
    a = 0
    b = 0
    
    while 1:
        if s == "1": break
        
        b += s.count("0")
        
        s = s.replace("0", "")
        
        s = bin(len(s))[2:]
        
        a += 1
    
    answer = [a,b]
    
    return answer