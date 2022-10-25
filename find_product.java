import java.util.Scanner;

public class find_product {
    public static void main(String[] args) {
        int i,mod=1000000007;
        double p=1;
        System.out.print("Enter the no. of terms: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println("Enter values of array of ratings: ");
        int A[] = new int[N];
        for(i=0;i<N;i++)
        {
            A[i] = in.nextInt();
            p=p*A[i];
            p=p%mod;
        }
        System.out.println(p);
    }
}
