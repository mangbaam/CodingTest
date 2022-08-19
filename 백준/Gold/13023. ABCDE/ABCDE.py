import sys

def input():
    return sys.stdin.readline().rstrip()

n, m = map(int, input().split())
finished = False
visited = [False] * (n + 1)
li = [list() for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, input().split())
    li[a].append(b)
    li[b].append(a)

def dfs(x, depth):
    global finished

    if depth == 5:
        finished = True
        return

    visited[x] = True
    for i in li[x]:
        if not visited[i]:
            dfs(i, depth + 1)

    visited[x] = False

for i in range(n):
    dfs(i, 1)
    if finished: break

print(1) if finished else print(0)