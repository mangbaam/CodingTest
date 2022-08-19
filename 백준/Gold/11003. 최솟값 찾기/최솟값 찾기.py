from collections import deque

N, L = map(int, input().split())
li = list(map(int, input().split()))
q = deque()

for i in range(N):
    while q and q[-1][1] > li[i]:
        q.pop()
    q.append((i, li[i])) # 인덱스, 값
    if i - q[0][0] >= L:
        q.popleft()
    print(q[0][1], end=' ')