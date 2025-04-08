def solution(n):
    answer = 0
    
    a = str(bin(n)[2:]).count("1")
    b = n+1
    c = -1
    while True:
        c = str(bin(b)[2:]).count("1")
        if a == c: return b
        
        b += 1