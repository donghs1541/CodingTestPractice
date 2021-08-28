class Solution {
    private boolean primeFind(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(primeFind(i)) answer++;
        }

        return answer;
    }
}