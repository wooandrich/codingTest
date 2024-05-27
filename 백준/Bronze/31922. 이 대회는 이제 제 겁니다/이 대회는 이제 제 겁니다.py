import math
import sys

input = sys.stdin.readline


a,b,c = map(int,input().split())

print(max(a+c, b))
