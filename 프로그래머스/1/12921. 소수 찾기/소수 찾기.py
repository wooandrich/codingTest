def isPrime(n):
    end = int(n**(1/2))
    for i in range(2, end+1):
        if n % i == 0:
            return False
    return True

def solution(n):
    answer = 0
    for i in range(2,n+1):
        if isPrime(i): answer += 1
    
    return answer