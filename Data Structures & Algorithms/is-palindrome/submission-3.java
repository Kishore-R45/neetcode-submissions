class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            while(l<r && !(Character.isDigit(s.charAt(l))) && !(Character.isLetter(s.charAt(l)))){
                l++;
            }
            while(l<r && !(Character.isDigit(s.charAt(r))) && !(Character.isLetter(s.charAt(r)))){
                r--;
            }
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
