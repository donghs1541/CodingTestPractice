def solution(answers):
    tester1 = [1, 2, 3, 4, 5] * 2000
    tester2 = [2, 1, 2, 3, 2, 4, 2, 5] * 1250
    tester3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5] * 1000
    tester_correct = [0, 0, 0]
    tester_index = 0

    for i in answers:
        if tester1[tester_index] == i:
            tester_correct[0] += 1
        if tester2[tester_index] == i:
            tester_correct[1] += 1
        if tester3[tester_index] == i:
            tester_correct[2] += 1

        tester_index += 1

    res_list = list(filter(lambda x: tester_correct[x] == max(tester_correct), range(len(tester_correct))))
    return [i + 1 for i in res_list]