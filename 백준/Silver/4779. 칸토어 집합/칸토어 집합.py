import sys




def ans(a,k):
    if k == 1:
        return
    for i in range(a + k//3, a + (k//3) * 2):
        result[i] = ' '
    ans(a, k//3)
    ans(a+k//3 * 2, k//3)




while 1:
    try:
        n = int(sys.stdin.readline().rstrip())
        result = ["-"] * 3**n
        ans(0,3**n)
        print(''.join(result))
    except:
        break