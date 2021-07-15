public class Fibonacci {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        int n1=0,n2=1,temp;
        int Outnumber = Utility.getUserInteger();
        for(int i=2;i<Outnumber;++i)
        {
            temp=n1+n2;
            System.out.println(" "+temp);
            n1=n2;
            n2=temp;
        }
    }
}
