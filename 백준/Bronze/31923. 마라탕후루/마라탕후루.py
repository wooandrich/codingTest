import sys

input = sys.stdin.readline


def solve():
    N, P, Q = map(int, input().split())
    A = list(map(int, input().split()))
    B = list(map(int, input().split()))

    ans = []
    for i in range(N):
        diff = A[i] - B[i]
        diff_2 = Q - P
        if diff_2 == 0:
            if diff == 0:
                ans.append(0)
            else:
                print("NO")
                return
        else:
            if (diff % (Q - P)) != 0:
                print("NO")
                return
        
            k = diff // (Q - P)
            if k < 0 or k > 10000:
                print("NO")
                return
            ans.append(k)

    print("YES")
    print(*ans)

solve()
