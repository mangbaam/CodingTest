def solution(A, B):
    try:
        return (B + B).index(A)
    except:
        return -1