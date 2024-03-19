from collections import deque

def solution(maps):
    answer = 0
    dx = [-1, 0, 1, 0]
    dy = [0, -1, 0, 1]
    
    def bfs(start, end):
        visited = [[False] * len(maps[0]) for _ in range(len(maps))]
        visited[start[0]][start[1]] == True

        queue = deque([(start[0], start[1], 0)])
        while queue:
            cx, cy, d = queue.popleft()

            if (cx, cy) == end:
                return d

            for i in range(4):
                nx, ny = cx + dx[i], cy + dy[i]
                if nx not in range(len(maps)) or ny not in range(len(maps[0])): continue
                if maps[nx][ny] == 'X': continue
                if visited[nx][ny]: continue
                visited[nx][ny] = True
                queue.append((nx, ny, d + 1))
        return -1
 
        
    start = (0, 0)
    laber = (0, 0)
    exit = (0, 0)
    for i in range(len(maps)):
        for j in range(len(maps[0])):
            if maps[i][j] == 'S':
                start = (i, j)
            if maps[i][j] == 'L':
                laber = (i, j)
            if maps[i][j] == 'E':
                exit = (i, j)

    ld = bfs(start, laber)
    ed = bfs(laber, exit)
    return -1 if ld == -1 or ed == -1 else ld + ed