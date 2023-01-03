def solution(n):
    return sum([x for x in range(n + 1) if not x % 2])