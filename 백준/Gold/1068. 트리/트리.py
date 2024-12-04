import sys
sys.setrecursionlimit(100000)  # 필요 시 재귀 제한 증가

input = sys.stdin.readline

def dfs_delete(num):
    # 노드와 그 하위 노드를 삭제
    for child in graph[num]:
        dfs_delete(child)
    graph[num] = []

def count_leaves(node):
    # 주어진 노드부터 리프 노드 수 카운트
    if not graph[node]:
        return 1
    total = 0
    for child in graph[node]:
        total += count_leaves(child)
    return total

n = int(input())
arr = list(map(int, input().split()))
target = int(input())

graph = [[] for _ in range(n)]
root = None

# 트리 구성 및 루트 노드 찾기
for i in range(n):
    if arr[i] == -1:
        root = i
    else:
        graph[arr[i]].append(i)

# 목표 노드가 루트가 아닌 경우, 부모의 인접 리스트에서 제거
if arr[target] != -1:
    graph[arr[target]].remove(target)
else:
    root = -1  # 루트가 삭제되면 트리는 비어 있음

dfs_delete(target)  # 목표 노드와 그 하위 노드 삭제

# 루트부터 리프 노드 수 카운트
if root != -1:
    ans = count_leaves(root)
else:
    ans = 0

print(ans)