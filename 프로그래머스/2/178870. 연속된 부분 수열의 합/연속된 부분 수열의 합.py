def solution(sequence, k):
    acc = [0]
    a = {}
    cand = []
    for x in sequence:
        acc.append(acc[-1] + x)
        
    for i, x in enumerate(acc):
        if x in a.keys():
            cand.append([max(a[x]), i - 1])
        try:
            a[k + x].append(i)
        except:   
            a[k + x] = [i]
    return min(cand, key = lambda x: (x[1] - x[0], x[0]))