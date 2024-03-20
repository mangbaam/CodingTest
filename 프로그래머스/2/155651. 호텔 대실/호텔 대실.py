def convert(time_str):
    h, m = map(int, time_str.split(':'))
    return h * 60 + m

def solution(book_time):
    answer = 0
    times = list(map(lambda x: [convert(x[0]), convert(x[1])], book_time))
    for now in range(convert("0:0"), convert("23:59") + 11):
        cnt = 0
        for time in times:
            if now in range(time[0], time[1] + 10):
                cnt += 1
        answer = max(answer, cnt)
    return answer