def solution(N, stages):
    answer = []
    
    length = len(stages)
    
    for i in range(1, N+1):
        count = stages.count(i)
        
        # 실패율 계산
        if length == 0:
            fail = 0
        else:
            fail = count / length
        
        # 리스트에 (스테이지번호, 실패율) 삽입
        answer.append((i, fail))
        length -= count
    
    # 실패율 기준으로 정렬
    answer.sort(key=lambda x: -x[1])
    
    # 정렬된 스테이지 번호출력
    answer = [i[0] for i in answer]
    
    return answer
    
        