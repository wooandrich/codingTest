ans = 0.0
cnt = 0
for i in range(20):
    a,b,c = input().split()
    b = float(b)
    if c == 'P':
        continue
    elif c == "A+":
        ans += 4.5 * b
        cnt += b
    elif c == "A0":
        ans += 4.0 * b
        cnt += b
    elif c == 'B+':
        ans += 3.5 * b
        cnt += b
    elif c == 'B0':
        ans += 3.0 * b
        cnt += b
    elif c == 'C+':
        ans += 2.5 * b
        cnt += b
    elif c == "C0":
        ans += 2.0 * b
        cnt += b
    elif c == "D+":
        ans += 1.5 * b
        cnt += b
    elif c == "D0":
        ans += 1.0 * b
        cnt += b
    elif c == "F":
        cnt += b
print(ans / cnt)