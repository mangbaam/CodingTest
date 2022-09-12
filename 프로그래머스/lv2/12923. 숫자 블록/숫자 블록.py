def solution(begin, end):
    answer = []
    
    for i in range(begin, end + 1):
        if i == 1:
            answer.append(0)
        else:
            for j in range(2, int(i ** (1 / 2)) + 1):
                d = i // j
                if d > 10 ** 7:
                    continue
                if not i % j:
                    answer.append(d)
                    break
            else:
                answer.append(1)
    return answer