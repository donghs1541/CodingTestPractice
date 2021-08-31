def solution(arr):
    answer = []

    for i in range(len(arr)):
        if i + 1 == len(arr):
            break
        if arr[i] != arr[i + 1]:
            answer.append(arr[i])

    answer.append(arr[i])

    return answer 