from collections import Counter

def solution(topping):
    answer = 0
    
    철수, 동생 = {topping[0] : 1}, dict(Counter(topping[1:]))
    for i in range(1, len(topping)):
        if len(철수.keys()) == len(동생.keys()):
            answer += 1
    
        철수[topping[i]] = 철수.get(topping[i], 0) + 1
        동생[topping[i]] -= 1
        if 동생[topping[i]] == 0:
            del 동생[topping[i]]

    return answer