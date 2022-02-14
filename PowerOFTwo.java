package LeetCode;

public class PowerOFTwo {
    public static void main(String[] args) {
        //System.out.println(isPowerOfTwo(8));
        System.out.println( isPowerOfFour(5));
    }
    static boolean isPowerOfTwo(int n){

        if (n <=0){
            return false;
        }
        if (n == 1){
            return true;
        }

       return (n % 2 == 0 && isPowerOfTwo(n/2));

    }
    static boolean isPowerOfFour(int n) {
        if(n<=0 ){
            return false;
        }
        if(n==1){
            return true;
        }
        return (n%4==0 && isPowerOfFour(n/4) || n % 2 == 0);
    }
}
