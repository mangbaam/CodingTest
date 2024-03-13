def solution(stones, k):
    answer = 0
    
    def check(stones, minus):
        n = 0
        for s in stones:
            if s - minus <= 0:
                n += 1
            else:
                n = 0
            if n == k: return True
        return False

    left, right = 1, 200_000_000
    while left <= right:
        mid = (left + right) // 2

        if check(stones, mid):
            right = mid - 1
        else:
            left = mid + 1
    return left