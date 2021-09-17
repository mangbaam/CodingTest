k = 0
aptMap = []

floor = [a for a in range(0, 15)]
aptMap.append(floor)

while k < 15:
    k += 1
    floor = [0, 1]
    for i in range(2, 15):
        floor.append(floor[i - 1] + aptMap[k - 1][i])
    aptMap.append(floor)

t = int(input())
for _ in range(t) :
    k = int(input())
    n = int(input())
    print(aptMap[k][n])
