import sys

n = int(sys.stdin.readline().rstrip())

arr = set()
ans = 0
for _ in range(n):
    chat = sys.stdin.readline().rstrip()
    if chat == 'ENTER':
        ans += len(arr)
        arr = set()
    else:
        arr.add(chat)
ans += len(arr)
print(ans)