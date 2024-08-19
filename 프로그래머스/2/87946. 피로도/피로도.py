import itertools

def solution(k, dungeons):
    answer = -1
    nPr = itertools.permutations(dungeons, len(dungeons))
    arr = list(nPr)
    for i in arr:
        temp = k
        cnt = 0
        for a,b in i:
            if (temp >= a):
                temp -= b
                cnt += 1
        answer = max(answer, cnt)
    return answer