package numbers_theory;

public class Reverse_a_number {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(reverse(n));
    }
    public static int reverse(int n){
        int temp = Math.abs(n);
        int ans = 0;
        while(temp > 0){
            int rem = temp % 10;
            //Check if 'ans' will overflow before multiplying by 10
            if(ans < Integer.MIN_VALUE / 10 || ans > Integer.MAX_VALUE / 10) return 0;
            ans = ans * 10 + rem;
            temp /= 10;
        }
        return ( n < 0) ? -ans : ans;
    }
}
