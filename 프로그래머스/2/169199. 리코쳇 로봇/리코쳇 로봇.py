from collections import deque

dx = [0, -1, 0, 1]
dy = [1, 0, -1, 0]

def solution(board):
    answer = 0
    
    R = 0, 0
    G = 0, 0
    for i in range(len(board)):
        for j in range(len(board[0])):
            if board[i][j] == 'R':
                R = i, j
            if board[i][j] == 'G':
                G = i, j
    print(R, G)
    
    visited = [[False] * len(board[0]) for _ in range(len(board))]

    def dfs(x, y):
        queue = deque([(x, y, 0)])
        while queue:
            cx, cy, d = queue.popleft()
            if board[cx][cy] == 'G':
                return d
        
            for i in range(4):
                nx, ny = cx, cy
                while nx + dx[i] in range(len(board)) and ny + dy[i] in range(len(board[0])) and board[nx + dx[i]][ny + dy[i]] != 'D':
                    nx += dx[i]
                    ny += dy[i]
                if board[nx][ny] == 'D': continue
                if visited[nx][ny]: continue
                visited[nx][ny] = True
                queue.append([nx, ny, d + 1])
        return -1
    
    return dfs(R[0], R[1])