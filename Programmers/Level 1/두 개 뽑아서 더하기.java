import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i=0;i< numbers.length;i++){
            int temp = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                if(answer.indexOf(temp+numbers[j]) < 0)
                    answer.add(temp+numbers[j]);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}