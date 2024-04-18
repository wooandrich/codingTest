arr = [[""] * 15 for i in range(5)]

for i in range(5):
    s = input()
    for j in range(len(s)):
        arr[i][j] = s[j]

for j in range(15):
    for i in range(5):
        if arr[i][j] == "":
            continue
        print(arr[i][j],end="")