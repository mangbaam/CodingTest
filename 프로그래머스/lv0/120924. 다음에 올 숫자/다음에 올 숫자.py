def solution(common):
    cha = True if common[2] - common[1] == common[1] - common[0] else False
    return common[-1] + common[1] - common[0] if cha else common[-1] * common[1] // common[0]