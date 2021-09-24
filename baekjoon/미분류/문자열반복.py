result = []
t = int(input())
for i in range(t) :
    r, s = input().split()
    r = int(r)
    j = 0
    for j in range(len(s)):
        for k in range(r):
            result.append(s[j])
    result.append("\n")

for i in result:
    print(i, end='')