from functools import reduce

def solution(data, col, row_begin, row_end):
    # 1. 정렬
    sorted_data = sorted(data, key = lambda x: (x[col - 1], -x[0]))
    
    # 2. 떼오고 모듈라
    mods = []
    for i in range(row_begin - 1, row_end):
        mods.append(sum(map(lambda x: x % (i + 1), sorted_data[i])))

    # 3. xor
    return  reduce(lambda acc, cur: acc ^ cur, mods, 0)