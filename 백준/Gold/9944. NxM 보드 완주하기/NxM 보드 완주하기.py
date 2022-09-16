INF = 10 ** 9
case = 1


def check():
    return board == [['*'] * M for _ in range(N)]


def rec_fun(x, y, count):
    global answer
    if check():
        answer = min(answer, count)
    if answer < count: return

    for dx, dy in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
        passed = list()
        nx, ny = x, y
        while True:
            nx += dx
            ny += dy
            if nx in range(N) and ny in range(M) and board[nx][ny] == '.':
                passed.append((nx, ny))
                board[nx][ny] = '*'
            else:
                break
        if passed:
            rec_fun(nx - dx, ny - dy, count + 1)

        for px, py in passed:
            board[px][py] = '.'


while True:
    try:
        N, M = map(int, input().split())
        visited = [[False] * M for _ in range(N)]
        board = [list(input()) for _ in range(N)]
        answer = INF
        for i in range(N):
            for j in range(M):
                if board[i][j] == '.':
                    board[i][j] = '*'
                    rec_fun(i, j, 0)
                    board[i][j] = '.'
        if answer == INF:
            answer = -1
        print(f'Case {case}: {answer}')
        case += 1
    except:
        break