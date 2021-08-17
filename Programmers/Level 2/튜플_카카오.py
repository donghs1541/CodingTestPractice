def solution(s):
    answer = []
    s = s.replace("{", "")
    s = s.replace("}", "")
    s = s.split(",")

    dic = {}

    for i in s:
        if i not in dic:
            dic[i] = 1
        else:
            dic[i] += 1

    while dic:
        value = max(dic.values())
        for k, v in dic.items():
            if v == value:
                answer.append(int(k))
                dic.pop(k)
                break

    return answer