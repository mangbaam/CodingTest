def solution(gems):
    N = len(gems)
    total = len(set(gems))
    answer = [0, N - 1]
    s, e = 0, 0
    gem_count = {gems[0]: 1}
    
    while s < N and e < N:
        if len(gem_count) < total:
            e += 1
            if e == N: break
            gem_count[gems[e]] = gem_count.get(gems[e], 0) + 1
        else:
            if answer[1] - answer[0] > e - s:
                answer = [s, e]
            gem_count[gems[s]] -= 1
            if gem_count[gems[s]] == 0:
                del gem_count[gems[s]]
            s += 1
    
    answer[0] += 1
    answer[1] += 1
    
    return answer