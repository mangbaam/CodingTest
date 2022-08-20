import sys

def input():
    return sys.stdin.readline().rstrip()

n, m = map(int, input().split())
parent = list(range(n + 1))
rank = [0] * (n + 1)

def find(x):
    if parent[x] != x:
        parent[x] = find(parent[x])
    return parent[x]

def union(a, b):
    p1, p2 = find(a), find(b)
    if rank[p1] > rank[p2]:
        parent[p2] = p1
    else:
        parent[p1] = p2
        if rank[p1] == rank[p2]:
            rank[p2] += 1

same = lambda a, b: find(a) == find(b)

for _ in range(m):
    a, b, c = map(int, input().split())
    if a:
        print("YES") if same(b, c) else print("NO")
    else:
        union(b, c)