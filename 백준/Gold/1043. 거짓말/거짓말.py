n, m = map(int, input().split())
count = 0
parent = list(range(n + 1))
truth = list(map(int, input().split()))[1:]
party = list()

def find(node):
    if parent[node] != node:
        parent[node] = find(parent[node])
    return parent[node]

def union(a, b):
    r1, r2 = map(find, (a, b))
    if r1 != r2:
        parent[r2] = r1

for _ in range(m):
    party.append(list(map(int, input().split()))[1:])

for people in party:
    for i in range(1, len(people)):
        union(people[i - 1], people[i])

root = find(1)
know = [parent[t] for t in truth]

for i in range(m):
    possible = True
    for t in truth:
        if find(party[i][0]) == find(t):
            possible = False
            break
    if possible:
        count += 1

print(count)