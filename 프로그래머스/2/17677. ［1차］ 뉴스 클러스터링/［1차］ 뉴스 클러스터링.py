def solution(str1, str2):
    answer = 0
    str1 = str1.lower()
    str2 = str2.lower()
    arr1 = []
    arr2 = []
    
    for i in range(len(str1) - 1):
        a = str1[i]
        b = str1[i+1]
        if a.isalpha() and b.isalpha():
            arr1.append(a+b)
    
    for i in range(len(str2) - 1):
        a = str2[i]
        b = str2[i+1]
        if a.isalpha() and b.isalpha():
            arr2.append(a+b)
    
    p = 0
    q = 0
    
    arr = arr1 + arr2
    arr = set(arr)
    
    for i in arr:
        if i in arr1 and i in arr2:
            p += min(arr1.count(i), arr2.count(i))
        q += max(arr1.count(i), arr2.count(i))
        
    if q == 0:
        answer = 65536
    else:
        answer = int(p/q*65536)
    
    
    
    return answer