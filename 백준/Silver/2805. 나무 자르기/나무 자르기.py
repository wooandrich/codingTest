import sys

n,m = map(int, sys.stdin.readline().rstrip().split())
arr = list(map(int, sys.stdin.readline().rstrip().split()))



start = 0
end = max(arr)
result = 0
while start <= end:
    total = 0
    mid = (start + end) // 2

    for i in arr:
        if mid < i:
            total += i - mid
    # 떡 양이 부족한 경우 더 많이 자르기
    if total < m:
        end = mid - 1
    # 떡 양이 충분한 경우
    else:
        result = mid # 최대한 덜 잘랐을 때가 정답이므로, 여기서 기록
        start = mid + 1

print(result)


