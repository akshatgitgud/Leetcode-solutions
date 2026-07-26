package math;

public class findifdigitgamecanbewon {
    public static void main(String[] args) {
        int[] arr ={1,2};
        System.out.println(count(10));
        canAliceWin(arr);
    }
    static boolean canAliceWin(int[] nums) {
    
    return false;
    }
    static int count(int n){
        int c=0;
        while(n>0){
            c+=1;
            n/=10;
        }
    return c;
    }
}
