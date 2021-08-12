def solution(s):
    answer = 1000
    for i in range(1,int(len(s)/2)+2): # 1~ 문자열 크기의 절반 +2까지
        zipString = "" #추가할 문자열 초기값
        zipCount=1 #초기 문자열 크기
        preStr = s[0:i]  #초기 문자열
        for j in range(i,len(s)+1,i): # i 크기만큼 나누어서 문자열 비교함
            nextStr = s[j:j+i]
            if preStr == nextStr:
                zipCount += 1
            else:
                if zipCount >= 2:
                    zipString = zipString + str(zipCount) + preStr
                else:
                    zipString = zipString + preStr
                zipCount = 1
                preStr = nextStr
        zipString += preStr

        if answer > len(zipString): # 이중 폴문의 작업이 끝난 스트링의 크기를 비교해 더 작은 값을 answer로 정함
            answer = len(zipString)

    return answer