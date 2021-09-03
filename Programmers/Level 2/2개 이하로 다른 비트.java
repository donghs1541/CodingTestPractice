class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        int index = 0;

        for(int i=0;i<numbers.length;i++){
            StringBuilder binaryValue = new StringBuilder(); // 수정을 편하게 하려고 스트링빌더 선언
            binaryValue.append("0"+Long.toBinaryString(numbers[i])); // 앞에 0을 추가 해서 수정편하게함 

            int leastValueIndex = binaryValue.lastIndexOf("0"); // 최하위비트부터 해서 0을 검색
            binaryValue.setCharAt(leastValueIndex,'1'); // 그리고 그걸 1로 변경함 

            if(numbers[i] % 2 == 1)
                binaryValue.setCharAt(binaryValue.indexOf("1",leastValueIndex +1),'0');
            //홀수면 다음 1을 0으로 변경
            answer[index++] = Long.parseLong(binaryValue.toString(),2);

        }
        return answer;
    }
}