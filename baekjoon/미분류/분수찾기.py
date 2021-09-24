def find(n):
  diff = 1    #   diff : 1, 2, 3,  4,  5,  6,  7,  8, ...
  maxNum = 0  # maxNum : 1, 3, 6, 10, 15, 21, 28, 36, ...
  sumNum = 1  # sumNum : 2, 3, 4,  5,  6,  7,  8,  9, ...
  direct = 0  # 0: 오른쪽 위, 1: 왼쪽 아래

  while maxNum < n:
    maxNum += diff
    diff += 1
    sumNum += 1
  if sumNum % 2:
    direct = 1
  else:
    direct = 0
  
  count = maxNum - n
  if direct == 0:
    ja = count + 1
    mo = sumNum - ja
  else:
    mo = count + 1
    ja = sumNum - mo
    
  return ja, mo


n = int(input())
ja, mo = find(n)

print(str(ja)+'/'+str(mo))