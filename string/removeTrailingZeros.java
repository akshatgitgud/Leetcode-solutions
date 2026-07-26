package string;

public class removeTrailingZeros {
    public static void main(String[] args) {
        System.out.println(remove("13200"));
    }

    static String remove(String num) {
        int n = num.length() - 1;
        int upto = 0;
        if (num.charAt(n) != '0')
            return num;
        else {
            while (n != 0) {
                if (num.charAt(n) != '0') {
                    upto = n;
                    break;
                }
                n--;
            }
        }
        return num.substring(0, upto+1);
    }
}
