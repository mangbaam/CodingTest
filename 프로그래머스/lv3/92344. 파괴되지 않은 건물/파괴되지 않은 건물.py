def solution(board, skill):
    accum = [[0] * (len(board[0]) + 1) for _ in range(len(board) + 1)]
    
    for sk in skill:
        p = 1 if sk[0] == 2 else -1
        accum[sk[1]][sk[2]] += p * sk[5] # 왼쪽 위
        accum[sk[1]][sk[4] + 1] += -p * sk[5] # 왼쪽 아래
        accum[sk[3] + 1][sk[4] + 1] += p * sk[5] # 오른쪽 아래
        accum[sk[3] + 1][sk[2]] += -p * sk[5] # 오른쪽 위
        
    # 누적 합
    for i in range(1, len(board)):
        for j in range(len(board[0])):
            accum[i][j] += accum[i - 1][j]
    for j in range(1, len(board[0])):
        for i in range(len(board)):
            accum[i][j] += accum[i][j - 1]
            
    answer = 0
    for i in range(len(board)):
        for j in range(len(board[0])):
            if board[i][j] + accum[i][j] > 0:
                answer += 1
            
    return answer