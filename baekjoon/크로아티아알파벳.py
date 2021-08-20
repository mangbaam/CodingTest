croatian = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

text = input()
count = 0

while len(text) > 0 :
    if text[:2] in croatian :
        text = text[2:]
    elif text[:3] in croatian :
        text = text[3:]
    else :
        text = text[1:]
    count += 1

print(count)