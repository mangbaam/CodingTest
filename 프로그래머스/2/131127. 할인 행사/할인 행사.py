def solution(want, number, discount):
    answer = 0
    정현 = dict(zip(want, number))
    
    for i in range(len(discount) - 9):
        tmp = 정현.copy()
        for j in range(i, i + 10):
            if discount[j] in tmp and tmp[discount[j]] != 0:
                tmp[discount[j]] -= 1
            else:
                break
        if sum(tmp.values()) == 0:
            answer += 1

    return answer

# 10일 동안 회원
# 회원 대상 매일 한 가지 제품 할인
# 할인 제품은 하나만 구매 가능
# 원하는 제품, 수량이 할인하는 날짜와 10일 연속으로 일치할 경우 회원가입

# 치킨, 사과, 사과, 바나나 ,쌀, 사과, 돼지고기, 바난, 돼지고기, 쌀, 냄비, 바나나, 사과, 바나나
