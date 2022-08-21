from collections import deque
import sys

def input():
    return sys.stdin.readline().rstrip()

n, m = map(int, input().split())
graph = [[] for _ in range(n + 1)]
table = [0] * (n + 1)
answer = []
q = deque()
for _ in range(m):
    a, b = map(int, input().split())
    table[b] += 1
    graph[a].append(b)

for i, x in enumerate(table):
    if i and x == 0:
        q.append(i)

while q:
    now = q.popleft()
    answer.append(now)
    for s in graph[now]:
        table[s] -= 1
        if table[s] == 0:
            q.append(s)

print(*answer)