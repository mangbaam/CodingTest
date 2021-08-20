two = ['A', 'B', 'C']
three = ['D', 'E', 'F']
four = ['G', 'H', 'I']
five = ['J', 'K', 'L']
six = ['M', 'N', 'O']
seven = ['P', 'Q', 'R', 'S']
eight = ['T', 'U', 'V']
nine = ['W', 'X', 'Y', 'Z']

dial = [[], [], two, three, four, five, six, seven, eight, nine]

count = 0
text = input()

for c in text:
    for i, nums in enumerate(dial):
        if c in nums:
            count += i + 1

print(count)