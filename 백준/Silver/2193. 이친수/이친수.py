n = int(input())
li = [[0] * 2 for _ in range(n + 1)]
li[1][1] = 1
li[1][0] = 0
for i in range(2, n + 1):
    li[i][0] = li[i - 1][0] + li[i - 1][1]
    li[i][1] = li[i - 1][0]
print(sum(li[n]))