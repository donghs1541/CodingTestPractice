def solution(n):

    answer = ''

    while n > 0: #n이 없어질때까지
        n -= 1  # n 1차감
        value = n%3 # 3진법이므로 n을 3으로 나눈 나머지를 계산
        if value == 0:
            answer = '1' +answer
        elif value == 1:
            answer = '2' +answer
        elif value == 2:
            answer = '4' +answer
        n //= 3 #자릿수 내림

    return answer