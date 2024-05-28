def solution(n, stations, w):
    answer = 0
    
    cnt = 2*w+1
    start = 1
    
    for station in stations:
        if (station - w - start) > 0:
            answer += (station - w - start) // cnt
            if (station - w - start) % cnt:
                answer += 1
        start = station + w + 1
    if n - start + 1 > 0:
        answer += (n-start+1)//cnt
        if (n-start+1)%cnt:
            answer+=1
            
        

    return answer