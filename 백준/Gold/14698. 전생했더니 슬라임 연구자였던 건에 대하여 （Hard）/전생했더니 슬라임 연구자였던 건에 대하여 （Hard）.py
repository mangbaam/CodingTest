import sys, heapq

MOD = 1_000_000_007

def input():
    return sys.stdin.readline().rstrip()

for _ in range(int(input())):
    n = int(input())
    slimes = list(map(int, input().split()))
    heapq.heapify(slimes)
    energy = 1
    while len(slimes) > 1:
        e = heapq.heappop(slimes) * heapq.heappop(slimes)
        heapq.heappush(slimes, e)
        energy = (energy * e) % MOD
    print(energy % MOD)