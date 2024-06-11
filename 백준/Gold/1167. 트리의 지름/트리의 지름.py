import sys
sys.setrecursionlimit(10**8)

def dfs(start, dist):
    for node,cnt in tree[start]:
        distance = cnt + dist
        if visited[node] == -1:
            visited[node] = distance
            dfs(node, distance)
    return


input = sys.stdin.readline

v = int(input())

tree = [[]for _ in range(v+1)]
visited = [-1] * (v+1)
visited[1] = 0
for i in range(1,v+1):
    data = list(map(int,input().split()))
    node, data = data[0], data[1:-1]
    for j in range(0,len(data)-1,2):
        tree[node].append((data[j],data[j+1]))
dfs(1,0)

max_node = visited.index(max(visited))
visited = [-1] * (v+1)
visited[max_node] = 0
dfs(max_node, 0)
print(max(visited))
