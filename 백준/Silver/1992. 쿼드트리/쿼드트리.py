import sys
sys.setrecursionlimit(10**6)

n = int(sys.stdin.readline().rstrip())

arr = []

for _ in range(n):
    data = [int(x) for x in list(sys.stdin.readline().rstrip())]
    arr.append(data)

def tree(n, n_list):
    cnt = 0

    for i in n_list:
        cnt += sum(i)

    if cnt == n ** 2:
        return '1'

    if cnt == 0:
        return '0'

    half = n // 2

    temp = '('
    temp += tree(half, [i[:half] for i in n_list[:half]])
    temp += tree(half, [i[half:] for i in n_list[:half]])
    temp += tree(half, [i[:half] for i in n_list[half:]])
    temp += tree(half, [i[half:] for i in n_list[half:]])
    temp += ')'

    return temp






print(tree(n,arr))


