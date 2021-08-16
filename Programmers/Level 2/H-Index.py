def solution(citations):
    citations.sort()

    for i in range(len(citations)):
        if citations[i] >= len(citations[i:]):
            # len(citations[i:]) 는 sort를 햇기때문에 현재 인용된 수 보다 많이 인용된 논문의 수를 뜻한다.
            return len(citations[i:])

    return 0
