def solution(targets):
    answer = 1
    targets.sort()
    INF = int(1e9)
    start = -INF
    end = INF
    
    for a,b in targets:
        if a >= end:
            answer += 1
            start = a
            end = b
        else:
            start = max(start , a)
            end = min(end, b)
    
    return answer