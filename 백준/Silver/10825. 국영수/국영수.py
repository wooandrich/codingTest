import sys

n = int(sys.stdin.readline().rstrip())

arr = []

for _ in range(n):
    data = sys.stdin.readline().rstrip().split()
    arr.append((data[0], int(data[1]), int(data[2]), int(data[3]))) # 이름, 국어, 영어, 수학

arr.sort(key=lambda x:(-x[1], x[2], -x[3], x[0]))

for student in arr:
    print(student[0])