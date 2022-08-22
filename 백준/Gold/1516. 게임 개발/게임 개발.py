from collections import deque

n = int(input())
build = [[] for _ in range(n + 1)]
time = [0] * (n + 1)
indegree = [0] * (n + 1)

for i in range(1, n + 1):
    user_input = deque(map(int, input().split()))
    user_input.pop()  # remove -1
    time[i] = user_input.popleft()
    for p in user_input:
        build[p].append(i)
    indegree[i] += len(user_input)

q = deque()
for i in range(1, n + 1):
    if indegree[i] == 0:
        q.append(i)

answer = [0] * (n + 1)
while q:
    now = q.popleft()
    for next in build[now]:
        indegree[next] -= 1
        answer[next] = max(answer[next], answer[now] + time[now])
        if indegree[next] == 0:
            q.append(next)

for i in range(1, n + 1):
    print(answer[i] + time[i])