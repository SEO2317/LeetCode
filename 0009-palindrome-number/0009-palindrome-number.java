class Solution {
    public boolean isPalindrome(int x) {
       if(x<0 || (x!=0 && x%10 == 0)){
           return false;
       }
        int left = x, right = 0;
        while(left>right){
            right = right * 10 + left % 10;
            left/=10;
        }
        return (left==right || left == right / 10);
    }
}