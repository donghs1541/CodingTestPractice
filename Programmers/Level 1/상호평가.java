import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(int[][] scores) {

        StringBuilder answer = new StringBuilder();
        int size = scores.length;

        double[] sum = new double[size];
        double[] arr = new double[size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum[j] += scores[i][j];
                if (i == j) arr[i] = scores[i][j];
            }
        }

        for (int i = 0; i < size; i++) {
            double temp = 0.0d;
            int count = size - 1;
            for (int j = 0; j < size; j++) {
                temp += scores[j][i];
                if ((scores[j][i] < arr[i]) && i != j) count--;
            }

            if (count == 0) {
                arr[i] = (temp - arr[i]) / (size - 1);
                continue;
            }

            count = size - 1;

            for (int j = 0; j < size; j++) {
                if ((scores[j][i] > arr[i]) && i != j) count--;
            }

            if (count == 0) {
                arr[i] = (temp - arr[i]) / (size - 1);
            } else {
                arr[i] = temp / size;
            }
        }

        for(int i=0; i<size; i++) {
            answer.append(Grade(arr[i]));
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