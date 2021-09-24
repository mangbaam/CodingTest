a, b, c = map(int, list(input().split()))
n = 1

if c < b:
    print(-1)
else:
    while a >= (c - b) * n:
        n += 1
    print(n)