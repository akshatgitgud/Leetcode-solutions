package string;

public class permutationdiff {
    public static void main(String[] args) {
        System.out.println(findPermutationDifference("abc", "bac"));
    }

    static int findPermutationDifference(String s, String t) {
        int sum=0;
        for(char i:s.toCharArray()){
            sum = sum+ Math.abs(s.indexOf(i)-t.indexOf(i));
        }
    return sum;
    }
}
