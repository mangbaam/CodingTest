n = int(input())

count = 0

count += n // 5
n %= 5
print( -1 if n % 3 else count + n//3)
