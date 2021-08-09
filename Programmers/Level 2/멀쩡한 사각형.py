def gcd(x,y):  #최대 공약수를 구하는 함수
    while y:
        x,y = y, x%y
    return x

def solution(w,h):
    answer = w*h -(w + h - (gcd(w,h)))  #대각선을 지나는 정사각형의 갯수를 구하는 공식
    return answer