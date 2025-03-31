a, b, c, d = map(int, input().split())

# Please write your code here.
min_x = c * 60 + d
min_y = a * 60 + b

print(min_x - min_y)