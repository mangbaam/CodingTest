from itertools import permutations
bab = ('aya', 'ye', 'woo', 'ma')

def solution(babbling):
    pre = list()
    for i in range(1, 5):
        pre.extend(list(map(lambda x: ''.join(x), permutations(bab, i))))
    return sum([1 for x in babbling if x in pre])