public class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] convertString = String.valueOf(n).toCharArray();
        for(int i=0;i<convertString.length;i++){
            answer += convertString[i] - 48;
        }

        return answer;
    }
}