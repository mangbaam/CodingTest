import re

def solution(user_id, banned_id):
    answer = set()
    ban_list = []

    for banned in banned_id:
        tmp = list()
        r = re.compile(banned.replace("*", "."))
        for user in user_id:
            if r.fullmatch(user) is not None:
                tmp.append(user)
        if tmp:
            ban_list.append(tmp)
                
    visited = {k: False for k in user_id}
    
    def rec_fun(t, li):
        nonlocal answer
        if t == len(ban_list):
            answer.add(tuple(sorted(li)))
            return
        for user in ban_list[t]:
            if visited[user]: continue
            visited[user] = True
            li.append(user)
            rec_fun(t + 1, li)
            li.pop()
            visited[user] = False
    
    rec_fun(0, list())
    
    return len(answer)