import heapq

def solution(n, k, enemy):
    h = [] # 가장 큰 값 3개 저장
    total = 0
    for i, e in enumerate(enemy):
        if len(h) < k:
            heapq.heappush(h, e)
        elif e > h[0]:
            total += heapq.heappop(h)
            heapq.heappush(h, e)
        else:
            total += e

        if total == n:
            return i + 1
        elif total > n:
            return i
    return len(enemy)