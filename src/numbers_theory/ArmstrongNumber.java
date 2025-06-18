package numbers_theory;

//An n-digit number is an Armstrong Number if, the sum of its digits raised to the power n
// is equal to the number itself

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 9474;
        System.out.println(checkArmstrong(n));
    }
    public static boolean checkArmstrong(int n){

//************************(TC - o(log10 n) )************************************

        int count = (int) Math.floor(Math.log10(n)) + 1;
        int temp = n;
        int sum = 0;

        while(temp > 0){
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);
            temp /= 10;
        }
        return sum == n;
    }
}
