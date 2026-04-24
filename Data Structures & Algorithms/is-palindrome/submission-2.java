class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        s=s.toLowerCase().trim();
        while(l<r){
            char lc=s.charAt(l);
            char rc=s.charAt(r);
            if(!Character.isLetterOrDigit(lc)){
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(rc)){
                r--;
                continue;
            }
            if(lc!=rc){
                return false;
            }
            r--;
            l++;
        }
        return true;
    }
}
