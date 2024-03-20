def solution(weights):
    pair = dict()

    answer = 0
    for weight in sorted(weights):
        answer += pair.get(weight, 0)

        if weight in pair.keys():
            pair[weight] += 1
        else:
            pair[weight] = 1
        
        if weight * 2 in pair.keys():
            pair[weight * 2] += 1
        else:
            pair[weight * 2] = 1
        
        a = weight * 1.5
        if a == int(a):
            if int(a) in pair.keys():
                pair[int(a)] += 1
            else:
                pair[int(a)] = 1
        
        b = weight * 4 / 3
        if b == int(b):
            if int(b) in pair.keys():
                pair[int(b)] += 1
            else:
                pair[int(b)] = 1

    return answer