from collections import deque
import sys

def input():
    return sys.stdin.readline().rstrip()

n = int(input())
li = [[] for _ in range(n + 1)]

for _ in range(n):
    info = list(map(int, input().split()))
    for i in range(1, len(info) - 1, 2):
        li[info[0]].append((info[i], info[i + 1]))

def bfs(x):
    distance = [0] * (n + 1)
    visited = [False] * (n + 1)
    q = deque([(x, 0)])
    visited[x] = True

    while q:
        now, dist = q.popleft()
        for nxt, d in li[now]:
            if visited[nxt]: continue
            distance[nxt] = dist + d
            visited[nxt] = True
            q.append((nxt, distance[nxt]))

    return distance

for i in range(1, n + 1):
    if li[i]:
        distance = bfs(i)
        break

max_index = max(zip(distance, range(n + 1)))[1]
result = bfs(max_index)

answer = 0
for i, r in enumerate(result):
    if i != max_index and answer < r:
        answer = r

print(answer)