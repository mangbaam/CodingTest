n, m = int(input()), int(input())
city = [[0] * (n + 1)]
parent = list(range(n + 1))
rank = [0] * (n + 1)
for _ in range(n):
    city.append([0] + list(map(int, input().split())))
route = list(map(int, input().split()))

def find(x):
    if parent[x] != x:
        parent[x] = find(parent[x])
    return parent[x]

def union(a, b):
    r1, r2 = find(a), find(b)
    if rank[r1] > rank[r2]:
        parent[r2] = r1
    else:
        parent[r1] = r2
        if rank[r1] == rank[r2]:
            rank[r2] += 1

for i in range(1, n + 1):
    for j in range(i + 1, n + 1):
        if city[i][j] and find(i) != find(j):
            union(i, j)

possible = True
r = find(route[0])
for i in route[1:]:
    if r != find(i):
        possible = False
        break
print("YES") if possible else print("NO")