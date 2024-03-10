def solution(numbers):
    answer = [0] * len(numbers)
    stack = [] # 뒷 큰수가 없는 인덱스

    for i, n in enumerate(numbers):
        while stack and numbers[stack[-1]] < n: # 뒷 큰수 발견되면
            answer[stack.pop()] = n # 뒷 큰수 기록
        stack.append(i)
    while stack:
        answer[stack.pop()] = -1 # 뒷 큰수가 없는 인덱스에 -1로 체크

    return answer