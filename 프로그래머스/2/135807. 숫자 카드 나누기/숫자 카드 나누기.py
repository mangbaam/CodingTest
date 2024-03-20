from functools import reduce
from math import gcd

def solution(arrayA, arrayB):
    answer = 0
    gcdA = reduce(gcd, arrayA)
    gcdB = reduce(gcd, arrayB)
    
    def check(arr, g):
        for x in arr:
            if x % g == 0: return False
        return True
    
    if gcdA >= gcdB:
        if check(arrayB, gcdA):
            answer = gcdA
        elif check(arrayA, gcdB):
            answer = gcdB
    else:
        if check(arrayA, gcdB):
            answer = gcdB
        elif check(arrayB, gcdA):
            answer = gcdA
    
    return answer if answer != 1 else 0