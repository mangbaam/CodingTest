def solution(n):
    answer = 1
    while True:
        x = (answer * n) / 6
        if x == int(x):
            return x
        answer += 1