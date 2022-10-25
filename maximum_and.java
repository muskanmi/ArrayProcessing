import java.util.Scanner;

public class maximum_and {
    public static void main(String[] args) {
        long P,Q,max;
        System.out.print("Enter no. of test cases: ");
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int l=0;l<T;l++)
        {
            System.out.print("Enter the values of A & B:");
            long A = in.nextLong();
            long B = in.nextLong();
            max=0;
            for(P=A;P<B;P++)
            {
                for(Q=P+1;Q<=B;Q++)
                {
                    if((P&Q)>max)
                        max=P&Q;
                }
            }
            System.out.println(max);
        }
    }
}
