def solution(lottos, win_nums):

    answer = []
    count = 0
    tempCount = 0
    result = []

    for i in lottos: #lottos 값 비교
        if i == 0: #0 일때
            tempCount += 1 #임시 카운트
        if i in win_nums: #로또 값이 당첨 로또번호일때
            count += 1

    result.append(count+tempCount) #제일 잘 맞았을때
    result.append(count) #실제로 맞았을때

    for rank in result: #맞춘 갯수 에 따른 최고순위 최저순위를 정해줌
        if rank == 6:
            answer.append(1)
        elif rank == 5:
            answer.append(2)
        elif rank == 4:
            answer.append(3)
        elif rank == 3:
            answer.append(4)
        elif rank == 2:
            answer.append(5)
        else:
            answer.append(6)

    return answer