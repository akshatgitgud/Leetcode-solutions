package string;

public class faultyKeyboard {
    public static void main(String[] args) {
        finalString("string");
    }
    static String finalString(String s) {
        StringBuilder ans = new StringBuilder();
        for(char i:s.toCharArray()){
            if(i!='i') ans.append(i);
            else ans.reverse();
        }
        System.out.println(ans);
    return ans.toString();
    }
}
