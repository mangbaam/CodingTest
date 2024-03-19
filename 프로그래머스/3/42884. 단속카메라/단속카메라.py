def solution(routes):
    answer = 0
    x = -30_000
    for route in sorted(routes, key = lambda x: x[1]):
        if route[0] > x:
            x = route[1]
            answer += 1

    return answer