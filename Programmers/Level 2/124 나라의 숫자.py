def solution(n):

    answer = ''
    while n > 0:
        n -= 1
        value = n%3
        if value == 0:
            answer = '1' +answer
        elif value == 1:
            answer = '2' +answer
        elif value == 2:
            answer = '4' +answer
        n //= 3

    return answer