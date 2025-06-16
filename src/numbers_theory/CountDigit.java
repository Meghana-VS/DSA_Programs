package numbers_theory;

public class CountDigit {
    public static void main(String[] args) {
        int n = -123;
        System.out.println(returnCount(n));
    }
    public static int returnCount(int n){
        // handle edge cases
        if(n == 0) return 1;

//**********************(Not efficient and cannot handle -ve numbers)****************
//        String s = String.valueOf(n);
//        return s.length();

//***********************(TC = o(log10 n))*********************************
        int count = 0;
        n = Math.abs(n);
        while(n > 0){
            count++;
            n /= 10;
        }
        return count;
    }
}
