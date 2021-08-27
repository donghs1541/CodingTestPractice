import java.util.HashMap;

class Solution {
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        HashMap<String, Integer> numbers = new HashMap<String, Integer>();
        numbers.put("zero",0);
        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);
        numbers.put("four",4);
        numbers.put("five",5);
        numbers.put("six",6);
        numbers.put("seven",7);
        numbers.put("eight",8);
        numbers.put("nine",9);

        for(int i=0;i<s.length();i++){
            char tempChar = s.charAt(i);
            if(tempChar >='0' && tempChar <='9'){
                answer.append(tempChar);
            }
            else{
                temp.append(tempChar);
                for(int j=0;j<10;j++){
                    if(numbers.containsKey(temp.toString())){
                        answer.append(numbers.get(temp.toString()));
                        temp.setLength(0);
                    }
                }
            }
        }

        return Integer.parseInt(answer.toString());
    }
}