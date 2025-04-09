def solution(answers):
    answer = []
    
    a = 0
    b = 0
    c = 0
    
    arr_a = [1,2,3,4,5]
    arr_b = [2, 1, 2, 3, 2, 4, 2, 5]
    arr_c = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    for i in range(len(answers)):
        if answers[i] == arr_a[i%len(arr_a)]:
            a += 1
        if answers[i] == arr_b[i%len(arr_b)]:
            b += 1
        if answers[i] == arr_c[i%len(arr_c)]:
            c += 1
    result = max(a,b,c)
    
    if a == result: answer.append(1)
    if b == result: answer.append(2)
    if c == result: answer.append(3)
    
    
    return answer