n, m = map(int, input().split())
a = []
for _ in range(n):
    a.append(list(input().split()))

virus = []
wall = []
for i in range(n):
    for j in range(m):
        if a[i][j] == '2':
            virus.append((i, j))
        elif a[i][j] == '0':
            wall.append((i, j))

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
visited = list()


def dfs(x, y):
    for i in range(4):
        nx, ny = x + dx[i], y + dy[i]
        if nx not in range(n) or ny not in range(m): continue
        if visited[nx][ny]: continue
        if a[nx][ny] == '1': continue
        visited[nx][ny] = True
        dfs(nx, ny)


def go():
    global visited

    count = 0
    visited = [[False] * m for _ in range(n)]

    for v in virus:
        visited[v[0]][v[1]] = True
        dfs(v[0], v[1])

    for i in range(n):
        for j in range(m):
            if a[i][j] == '0' and not visited[i][j]:
                count += 1

    return count


# 벽 3개 세우기
answer = 0
for i in range(len(wall)):
    for j in range(i):
        for k in range(j):
            a[wall[i][0]][wall[i][1]] = '1'
            a[wall[j][0]][wall[j][1]] = '1'
            a[wall[k][0]][wall[k][1]] = '1'
            answer = max(answer, go())
            a[wall[i][0]][wall[i][1]] = '0'
            a[wall[j][0]][wall[j][1]] = '0'
            a[wall[k][0]][wall[k][1]] = '0'

print(answer)