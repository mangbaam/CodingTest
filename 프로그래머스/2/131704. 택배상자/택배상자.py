from collections import deque

def solution(order):
    answer = 0
    boxes = deque(range(1, len(order) + 1))
    stack = []

    for now in order:
        if stack and stack[-1] == now:
            x = stack.pop()
            answer += 1
            continue

        while boxes and boxes[0] != now:
            stack.append(boxes.popleft())

        if boxes and boxes[0] == now:
            x = boxes.popleft()
            answer += 1
            continue
        break

    return answer