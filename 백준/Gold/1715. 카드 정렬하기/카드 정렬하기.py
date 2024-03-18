import sys
import heapq

n = int(sys.stdin.readline().rstrip())

heap = []
for i in range(n):
    data = int(sys.stdin.readline().rstrip())
    heapq.heappush(heap, data)

result = 0

# 힙에 원소가 1개 남을 때까지
while len(heap) != 1:
    # 가장 작은 2개의 카드 묶음 꺼내기
    one = heapq.heappop(heap)
    two = heapq.heappop(heap)
    # 카드 묶음을 다시 합쳐서 다시 삽입
    sum_value = one + two
    result += sum_value
    heapq.heappush(heap, sum_value)
print(result)



