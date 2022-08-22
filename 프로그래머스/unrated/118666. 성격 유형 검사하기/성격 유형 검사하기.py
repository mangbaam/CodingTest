def solution(survey, choices):
    character = {k: 0 for k in "RTCFJMAN"}

    for i in range(len(survey)):
        if choices[i] < 4:
            character[survey[i][0]] += 4 - choices[i]
        elif choices[i] > 4:
            character[survey[i][1]] += choices[i] - 4

    first = 'R' if character['R'] >= character['T'] else 'T'
    second = 'C' if character['C'] >= character['F'] else 'F'
    third = 'J' if character['J'] >= character['M'] else 'M'
    fourth = 'A' if character['A'] >= character['N'] else 'N'

    return f"{first}{second}{third}{fourth}"