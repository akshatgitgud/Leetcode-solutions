class Solution {
       public boolean isPalindrome(String s) {
        if (s.length()<=1) return true;
        String a = "";
        for(char i: s.toCharArray()){
            if(Character.isLetterOrDigit(i)) a = a+i;
            // Got to know about this simple Character method
        }
    return drome(a.toLowerCase());
    }
    public boolean drome(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
    return true;
    }
}