public class ReverseInt {
    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Reversed: " + reverse(num));
    }
}
