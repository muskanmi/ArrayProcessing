import java.util.Scanner;
public class number_of_primes {
    public static void main(String[] args) {
        long i,j,f,c=0;
        System.out.print("Enter a number: ");
        Scanner in=new Scanner(System.in);
        long N=in.nextLong();
        for(i=2;i<=N;i++)
        {
            f=0;
            for(j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
                ++c;
        }
        System.out.print(c);
    }
}
