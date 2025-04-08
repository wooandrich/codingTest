import sys
sys.setrecursionlimit(1000000)

def solution(n):
    arr = [-1] * (n+1)
    arr[0] = 0
    arr[1] = 1
    def fibo(n):
        if arr[n] != -1:
            return arr[n]

        arr[n] = (fibo(n - 1) + fibo(n-2)) % 1234567
        return arr[n]
    
    
    
    return fibo(n)