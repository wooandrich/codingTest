plus, mius = map(int, input().split())

if (plus + mius) % 2 !=0 or (plus+mius) < 0 or (plus-mius) < 0:
    print(-1)
else:
    a = (plus + mius) // 2
    b = plus - a
    print(a,b)