def checkChar(p):
    count = 0
    for char in p:
        if char == "(":
            count += 1
        else:
            if count <= 0:
                return False
            count -= 1
    return True


def findChar(p):
    count = 0
    for i in range(len(p)):
        if p[i] == "(":
            count += 1
        elif p[i] == ")":
            count -= 1
        if count == 0:
            return i


def solution(p):
    if p == "":
        return p
    answer = ""
    balanceIndex = findChar(p)
    u = p[:balanceIndex + 1]  # 균형잡힌거
    v = p[balanceIndex + 1:]  # 균형잡힌거

    if checkChar(u):
        answer += u + solution(v)
    else:
        answer = '('
        answer += solution(v)
        answer += ')'
        u = list(u[1:-1])
        for i in range(len(u)):
            if u[i] == '(':
                u[i] = ')'
            else:
                u[i] = '('
        answer += ''.join(u)

    return answer