public class Solution {
    public boolean isPalindrome(int x) {
        int revno = 0;
        int dup = x; 
        if (x < 0) {
            return false; 
        }


        while (x != 0) {
            int lastdigit = x / 10;
            x = x / 10;
            revno = (revno * 10) + lastdigit;
        }

        return revno == dup;
    }

    public static void main(String[] args) {
        int x = 121;
        Solution solution = new Solution();
        boolean isPalin = solution.isPalindrome(x);

        System.out.println("Is " + x + " a palindrome? " + isPalin);
    }
}
