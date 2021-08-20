# 1, 7, 19, 37, 61, ...
# 6, 12, 18, 24

# 계차수열 문제
def seq(n):
    item = 1
    diff = 0
    count = 1
    while item < n:
        if n == 1:
            break
        diff += 6
        item += diff
        count += 1
    return count

n = int(input())
print(seq(n))