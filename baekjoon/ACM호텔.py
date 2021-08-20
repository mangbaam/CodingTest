import math
t = int(input())
for _ in range(t):
    h, w, n = map(int, input().split())
    yy = n % h if n % h != 0 else h
    xx = math.ceil(n / h)
    print(yy * 100 + xx)