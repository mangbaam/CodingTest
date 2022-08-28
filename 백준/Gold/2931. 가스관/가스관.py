from collections import deque
import sys

def input():
    return sys.stdin.readline().rstrip()

direct = {
    '|': [(-1, 0), (1, 0)],
    '-': [(0, -1), (0, 1)],
    '+': [(-1, 0), (1, 0), (0, -1), (0, 1)],
    '1': [(0, 1), (1, 0)],
    '2': [(-1, 0), (0, 1)],
    '3': [(-1, 0), (0, -1)],
    '4': [(0, -1), (1, 0)],
    'Z': []
}

def bfs(start):
    visited = [[False] * c for _ in range(r)]
    visited[start[0]][start[1]] = True
    q = deque()

    # 시작 파이프 찾기
    for x, y in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
        nx, ny = start[0] + x, start[1] + y
        if nx in range(r) and ny in range(c) and arr[nx][ny] != '.':
            visited[nx][ny] = True
            q.append((nx, ny))

    # 탐색 시작
    while q:
        cx, cy = q.popleft()
        if arr[cx][cy] == '.':
            return cx, cy
        for x, y in direct[arr[cx][cy]]:
            nx, ny = cx + x, cy + y
            if nx in range(r) and ny in range(c) and not visited[nx][ny]:
                visited[nx][ny] = True
                q.append((nx, ny))

r, c = map(int, input().split())
arr = [list(input()) for _ in range(r)]

# find M
found = False
for i in range(r):
    for j in range(c):
        if arr[i][j] == 'M':
            M = (i, j)
            found = True
            break
    if found: break

mx, my = bfs(M)

p = [False] * 4 # 상, 하, 좌, 우

# 위
if mx - 1 in range(r) and arr[mx - 1][my] in ['|', '+', '1', '4']:
    p[0] = True
# 아래
if mx + 1 in range(r) and arr[mx + 1][my] in ['|', '+', '2', '3']:
    p[1] = True
# 왼쪽
if my - 1 in range(c) and arr[mx][my - 1] in ['-', '+', '1', '2']:
    p[2] = True
# 오른쪽
if my + 1 in range(c) and arr[mx][my + 1] in ['-', '+', '3', '4']:
    p[3] = True

num = 0
for i in range(4):
    if p[i]: num += 2 ** (3 - i)

hacked = {
    3: '-',
    5: '1',
    6: '4',
    9: '2',
    10: '3',
    12: '|',
    15: '+'
}

print(mx + 1, my + 1, hacked[num])