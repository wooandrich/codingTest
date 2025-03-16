from collections import deque

def solution(storage, requests):
    # 초기 상태 저장
    for r in requests:
        if len(r) == 1:
            storage = car(storage, r[0])
        elif len(r) == 2:
            storage = crane(storage, r[0])
    # 남은 컨테이너 수 계산
    answer = sum(row.count("-") for row in storage)
    total_cells = len(storage) * len(storage[0])
    return total_cells - answer

def car(storage, target):
    rows, cols = len(storage), len(storage[0])
    q = deque()
    visited = set()
    
    # 1. 가장자리에서 접근 가능한 위치 찾기
    for i in range(rows):
        for j in range(cols):
            if i == 0 or i == rows - 1 or j == 0 or j == cols - 1:
                if storage[i][j] == target:
                    q.append((i, j))  # target이면 BFS 시작점으로 추가
                elif storage[i][j] == "-":
                    q.append((i, j))  # 빈 공간도 접근 가능성 확인용
    
    # 방향 벡터 (상, 하, 좌, 우)
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
    
    # 2. BFS로 접근 가능한 target 제거
    while q:
        x, y = q.popleft()
        if (x, y) in visited:
            continue
        visited.add((x, y))
        
        # 현재 위치가 target이면 제거
        if storage[x][y] == target:
            # 문자열 수정: 해당 행을 새 문자열로 대체
            storage[x] = storage[x][:y] + "-" + storage[x][y+1:]
            continue
        
        # 인접 셀 탐색
        for dx, dy in directions:
            nx, ny = x + dx, y + dy
            if 0 <= nx < rows and 0 <= ny < cols and (nx, ny) not in visited:
                if storage[nx][ny] == "-" or storage[nx][ny] == target:
                    q.append((nx, ny))
    
    return storage

def crane(storage, target):
    # 모든 target을 "-"로 변경
    return [s.replace(target, "-") for s in storage]