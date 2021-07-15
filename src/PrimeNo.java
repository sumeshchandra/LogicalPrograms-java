public class PrimeNo {
    public static void main(String[] args) {
        System.out.print("enter any number : ");
        int Num = Utility.getUserInteger();
        int flag = 1;
        for (int i = 2; i <= Num / 2; i++) {
            if (Num % i == 0) {
                flag = 0;
                break;
            } else {
                flag = 1;
                continue;
            }
        }
        if (flag == 1) {
            System.out.println(Num + " is a prime number");
        } else {
            System.out.println(Num + " is not a prime number");
        }
    }
}
