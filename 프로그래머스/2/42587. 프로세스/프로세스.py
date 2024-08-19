def solution(priorities, location):
    q = []
    answer = 1
    for i in range(len(priorities)):
        q.append((priorities[i], i))
    
    while q:
        now = q[0][0]
        idx = q[0][1]
        for val, cnt in q:
            if now < val:
                q.append((now, idx))
                q.pop(0)
                flag = False
                break
        else:
            if (idx == location):
                break
            else:
                q.pop(0)
                answer+=1
        
    
    
    return answer