count = int(input())
result = 0

for i in range(count):
    text = input()
    checker = [0]
    for c in text:
        if checker[-1] is not c:
            if c in checker:
                result += 1
                break
            checker.append(c)

result = count - result
print(result)