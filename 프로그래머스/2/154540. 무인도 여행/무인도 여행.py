from collections import deque

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def solution(maps):
    answer = []
    visited = [[False] * len(maps[0]) for _ in range(len(maps))]

    def dfs(x, y):
        count = 0
        queue = deque([(x, y)])
        while queue:
            cx, cy = queue.popleft()
            count += int(maps[cx][cy])
            for i in range(4):
                nx, ny = cx + dx[i], cy + dy[i]
                if nx not in range(len(maps)) or ny not in range(len(maps[0])): continue
                if maps[nx][ny] == 'X': continue
                if visited[nx][ny]: continue
                visited[nx][ny] = True
                queue.append([nx, ny])
        return count

    for i in range(len(maps)):
        for j in range(len(maps[0])):
            if maps[i][j] == 'X': continue
            if visited[i][j]: continue
            visited[i][j] = True
            answer.append(dfs(i, j))

    return sorted(answer) if answer else [-1]