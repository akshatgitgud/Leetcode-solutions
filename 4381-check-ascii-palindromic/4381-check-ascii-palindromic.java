class Solution {
   public boolean isPalindromic(String s) {
        String str = "";
        for (char i : s.toCharArray()) {
            String bin = Integer.toBinaryString(i);
            while (bin.length() < 8) {
                bin = "0" + bin;
            }
            str += bin;
        }
        return palindrome(str);
    }

    public boolean palindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else
                return false;
        }
        return true;
    }
}