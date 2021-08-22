import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(int[][] scores) {
        StringBuilder answer = new StringBuilder();
        int size = scores.length;

        for(int i=0;i<size;i++){
            int min = 100;
            int max = 0;
            int sum = 0;
            int checkCount = 0;
            int checkCount2 = 0;
            int miner = 0;
            int count =size;
            for(int j=0;j<size;j++){
                if(min > scores[j][i]) min = scores[j][i];
                if(max < scores[j][i]) max = scores[j][i];
            }
            for(int j=0;j<size;j++){
                if(min == scores[j][i]) checkCount++;
                if(max == scores[j][i]) checkCount2++;
            }

            for(int j=0;j<size;j++){
                if(j==i){
                    if(scores[j][i] == min && checkCount <= 1){
                        miner = scores[j][i];
                        count--;
                    }
                    else if(scores[j][i] == max && checkCount2 <= 1){
                        miner = scores[j][i];
                        count--;
                    }
                }
                sum += scores[j][i];
            }
            sum -= miner;
            answer.append(Grade((double)sum/(double)count));
        }
        return answer.toString();
    }

    private char Grade(double grade) {
        if (grade >= 90.0) {
            return 'A';
        } else if (grade >= 80.0) {
            return 'B';
        } else if (grade >= 70.0) {
            return 'C';
        } else if (grade >= 50.0) {
            return 'D';
        } else {
            return 'F';
        }
    }
}