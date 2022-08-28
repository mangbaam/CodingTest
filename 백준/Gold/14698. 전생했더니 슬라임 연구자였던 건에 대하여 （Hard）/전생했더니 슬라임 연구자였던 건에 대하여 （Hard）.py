MOD = 1_000_000_007

import sys

def input():
    return sys.stdin.readline().rstrip()

for _ in range(int(input())):
    n = int(input())
    slimes = list(map(int, input().split()))
    energy = 1
    while len(slimes) > 1:
        slimes.sort(reverse=True)
        e = slimes.pop() * slimes.pop()
        slimes.append(e)
        energy = (energy * e) % MOD
    print(energy % MOD)