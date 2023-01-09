def solution(today, terms, privacies):
    def to_date(date):
        y, m, d = map(int, date.split('.'))
        return y * 28 * 12 + m * 28 + d

    answer = []
    
    terms = dict(map(lambda x: x.split(), terms))
    for i in range(len(privacies)):
        d, t = privacies[i].split()
        if to_date(d) + int(terms[t]) * 28 - 1 < to_date(today):
            answer.append(i + 1)
    
    return answer