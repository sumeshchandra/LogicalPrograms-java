import jdk.jshell.execution.Util;

public class ReverseNumber {
    public static void main(String[] args) {
        int rem = 0;
        int rev = 0;
        System.out.print("Enter a Number : ");
        int num = Utility.getUserInteger();
        while (num > 0) {
            rem = num % 10;                        // calculating reverse of a no
            rev = rem + rev * 10;
            num = num / 10;
        }
        System.out.println("reverse of the number is : " + rev);
    }
}
