c = lambda x: x * (x - 1) // 2

n, m = map(int, input().split())
li = list(map(int, input().split()))
last = 0
reminder = [0] * m
for i in li:
    last = (last + i) % m
    reminder[last] += 1

print(reminder[0] + sum([c(x) for x in reminder]))