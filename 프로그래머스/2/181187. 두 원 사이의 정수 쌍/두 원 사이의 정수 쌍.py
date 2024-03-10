import math

def solution(r1, r2):
    count = 0
    for i in range(1, r2 + 1):
        s = 0 if i >= r1 else math.ceil(math.sqrt(r1 ** 2 - i ** 2))
        e = int(math.sqrt(r2 ** 2 - i ** 2))
        count += (e - s + 1)
    return count * 4
