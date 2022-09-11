from collections import deque

def solution(queue1, queue2):
    q1, q2 = deque(queue1), deque(queue2)
    s1, s2 = sum(q1), sum(q2)
    n = len(q1) + len(q2)
    
    for i in range(n * 2):
        if s1 == s2:
            return i
        if s1 > s2:
            item = q1.popleft()
            q2.append(item)
            s1 -= item
            s2 += item
        else:
            item = q2.popleft()
            q1.append(item)
            s1 += item
            s2 -= item
    return -1