package numbers_theory;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 1221;
        System.out.println(checkPalindrome(n));
    }
    public static boolean checkPalindrome(int n){

//*************************(TC - o(log10 n) )************************************
//        int original = n;
//        int reverse = 0;
//
//        if(n == 0) return true;
//        if(n < 0) return false;
//        while(n > 0){
//            int digit = n % 10;
//            reverse = reverse * 10 + digit;
//            n /= 10;
//        }
//        return (original == reverse);

//************************(TC - o(log10 n) )************************************
        if(n < 0) return false;
        if(n >= 0 && n < 10) return true;
        int digitCount = (int) Math.floor(Math.log10(n)) + 1;
        while(digitCount > 1){
            int pow = (int) Math.pow(10, digitCount - 1);

            int left = n / pow;
            int right = n % 10;

            if(left != right) return false;

            n = (n % pow) / 10;
            digitCount -= 2;
        }
        return true;
    }
}
