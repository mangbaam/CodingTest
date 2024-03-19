def solution(n, times):
    answer = 0
    times.sort(reverse = True)
    
    s, e = 0, n * times[-1]


    def check():
        cnt = 0
        for time in times:
            cnt += mid // time
            if cnt >= n:
                return True
        return False


    while s <= e:
        mid = (s + e) // 2
        
        if check():
            e = mid - 1
        else:
            s = mid + 1
    
    return s