import sys

n, c = map(int, sys.stdin.readline().rstrip().split())

arr = []

for _ in range(n):
    arr.append(int(sys.stdin.readline().rstrip()))
arr.sort()

start = 1 # 가능한 최소 거리(min gap)
end = arr[-1] - arr[0] # 가능한 최대 거리(max gap)
result = 0

while start <= end:
    mid = (start + end) // 2
    value = arr[0]
    count = 1
    # 현재의 mid값을 이용해 공유기 설치
    for i in range(1, n): # 앞에서 부터 차근차근 설치
        if arr[i] >= value + mid:
            value = arr[i]
            count += 1
    if count >= c: # c개 이상의 공유기를 설치할 수 있는 경우, 거리를 증가
        start = mid + 1
        result = mid # 최적의 결과를 저장
    else:
        end = mid - 1
print(result)
