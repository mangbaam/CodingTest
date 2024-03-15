from collections import deque

dx = [-2, -1, 1, 2, 2, 1, -1, -2]
dy = [-1, -2, -2, -1, 1, 2, 2, 1]

def bfs(size, now, target):
    dist = [[-1] * size for _ in range(size)]
    dist[now[0]][now[1]] = 0
    
    queue = deque([now])

    while queue:
        x, y = queue.popleft()
        if [x, y] == target: break
        for i in range(8):
            nx, ny = x + dx[i], y + dy[i]
            if nx not in range(size) or ny not in range(size): continue
            if dist[nx][ny] != -1: continue
            queue.append([nx, ny])
            dist[nx][ny] = dist[x][y] + 1
    return dist[target[0]][target[1]]


for _ in range(int(input())):
    size = int(input())
    now = list(map(int, input().split()))
    target = list(map(int, input().split()))
    print(bfs(size, now, target))