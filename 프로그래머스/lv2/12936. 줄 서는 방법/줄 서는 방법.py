f = [1, 1]

def solution(n, k):
    set_fact(n)
    nums = list(range(1, n + 1))
    k -= 1
    answer = []
    
    for i in range(n, 0, -1):
        m = f[n]
        s = m // n
        answer.append(nums[k//s])
        nums.pop(k//s)
        k %= s
        n -= 1
    
    return answer

def set_fact(n):
    for i in range(2, n + 1):
        f.append(f[-1] * i)