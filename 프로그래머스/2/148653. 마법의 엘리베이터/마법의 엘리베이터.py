def solution(storey):
    answer = 0
    
    while storey != 0:
        rem = storey % 10
        if rem > 5 or (storey > 10 and rem == 5 and storey % 100 // 10 >= 5):
            answer += 10 - rem
            storey //= 10
            storey += 1
        else:
            answer += rem
            storey //= 10

    return answer