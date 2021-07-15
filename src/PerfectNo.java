public class PerfectNo {

    public static void main(String[] args) {

        int num, sum = 0;
        System.out.print("Enter an integer:");
        num = Utility.getUserInteger();
        for(int i = 1; i < num; i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == num)
        {
            System.out.println("The number is Perfect");
        }
        else
        {
            System.out.println("The number is not Perfect");
        }
    }
}
