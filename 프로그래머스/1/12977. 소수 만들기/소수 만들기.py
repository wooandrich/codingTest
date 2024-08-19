import itertools
def solution(nums):
    answer = 0
    a = []

    arr = list(itertools.combinations(nums, 3))
    for i in arr:
        a.append(sum(i))
    
    for i in a:
        flag = True
        for j in range(2, i):
            if i % j == 0:
                flag = False
                break
        if flag:
            answer += 1

    return answer