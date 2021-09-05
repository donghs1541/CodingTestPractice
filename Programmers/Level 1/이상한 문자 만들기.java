class Solution {
    public StringBuilder solution(String s) {
        StringBuilder answer = new StringBuilder(s);
        int index = 0;
        for(int i=0;i < s.length();i++){
            if(s.charAt(i) == ' '){
                index = 0;
                continue;
            }
            if(index % 2 == 1)
                answer.setCharAt(i,Character.toLowerCase(s.charAt(i)));
            else if(index % 2 == 0)
                answer.setCharAt(i,Character.toUpperCase(s.charAt(i)));
            index++;
        }
        return answer;
    }
}