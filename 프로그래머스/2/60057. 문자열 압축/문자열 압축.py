def solution(s):
    length = len(s)
    answer = length
    
    for i in range(1, length // 2 + 1):
        cnt = 0
        result = ""
        a = ""
        for j in range(0,length,i):
            if a == s[j:j+i]:
                cnt += 1
            else:
                if cnt > 1:
                    result += str(cnt)
                cnt = 0
                cnt += 1
                result+=s[j:j+i]
            a = s[j:j+i]
        if cnt > 1:
            result += str(cnt)

        answer = min(answer, len(result))
        
    return answer