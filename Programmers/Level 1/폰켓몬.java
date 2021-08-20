def solution(price, money, count):
    finalAmount = 0

    for i in range(1, count + 1):  # count 만큼 반복
        finalAmount += price * i  # 탄만큼의 요금 가중부가

    if money > finalAmount:  # 최종요금이 소지금액보다 적으면 0반환
        return 0

    return finalAmount - money  # 아니면 얼마 부족한지 반환