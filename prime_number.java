import java.util.Scanner;
public class prime_number {
    public static void main(String[] args) {
        int i,j,f;
        System.out.print("Enter a number: ");
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
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
                System.out.print(i+" ");
        }
    }
}
