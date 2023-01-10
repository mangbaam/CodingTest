def solution(price):
    pay = lambda x: int(x)
    if price >= 5e5: return pay(price * 0.8)
    elif price >= 3e5: return pay(price * 0.9)
    elif price >= 1e5: return pay(price * 0.95)
    else: return price