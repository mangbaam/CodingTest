from collections import deque

def solution(maps):
    q = deque([(0, 0, 1)])
    w, h = len(maps[0]), len(maps)
    visited = [[False] * w for _ in range(h)]
    while q:
        cx, cy, steps = q.popleft()
        if cx == h - 1 and cy == w - 1:
            return steps
        for dx, dy in ((-1, 0), (1, 0), (0, -1), (0, 1)):
            nx = cx + dx
            ny = cy + dy
            if nx in range(h) and ny in range(w) and not visited[nx][ny] and maps[nx][ny]:
                visited[nx][ny] = True
                q.append((nx, ny, steps + 1))

    return -1