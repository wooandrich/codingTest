def solution(name, yearning, photo):
    answer = []
    for arr in photo:
        temp = 0
        for val in arr:
            if val in name:
                temp += yearning[name.index(val)]
        answer.append(temp)
    return answer